package passionPic;

import lombok.Data;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;

@Data
@Component
public class GetPic {

    private HashSet<String> set = new HashSet();

    @Value("${SELANGWO}")
    private String endpoint = null;

    @Test
    public void execute(String search) {
        String[] listsResources = getListsResources(1);
//        for (int i = 0; i < listsResources.length; i++) {
            for (int i = 0; i < 3; i++) {
            String listResult = getResultFromURI(endpoint, listsResources[i]);
            getValueFromList(listResult, search);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("===" + iterator.next());
        }
    }

    private String getResultFromURI(String endpoint, String resources) {
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        String result = null;
        try {
            URL url = new URL(endpoint + resources);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000 * 10000);
            connection.setReadTimeout(1000 * 10000);
            byte bytes[] = new byte[1024];
            is = connection.getInputStream();
            baos = new ByteArrayOutputStream();
            int len = 0;
            while (-1 != (len = is.read(bytes))) {
                baos.write(bytes, 0, len);
                baos.flush();
            }
            result = baos.toString("UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }

    private void getValueFromList(String listResult, String search) {
        String[] strings = listResult.split("<ul><li class=\"zxsyt\">");
        String str = null;
        for (int i = 1; i < strings.length; i++) {
            str = strings[i];
            if (str.contains(search)) {
                //<img src=/images/neisan.gif border=0> <a href="/html/PIC01/376387.html" target="_blank">可愛的95年小美女露咪咪給我看，微信認識的 【15P】</a></li><li class="zxsyd">2017年06月03日</li></ul>
                set.add(str);
            }
        }
    }

    private String[] getListsResources(int picNum) {
        String pic = "/PIC" + translateNum(picNum);
        String singleWebSecourceResult = getResultFromURI(endpoint, pic + "/index.html");
        //<ul><li class="zxsyt"><img src=/images/neisan.gif border=0> <a href="/html/PIC01/391752.html" target="_blank">骚货的黑屄肥又大【11P】</a></li><li class="zxsyd">2018年01月13日</li></ul>
        int start = singleWebSecourceResult.indexOf("</font>/");
        int end = singleWebSecourceResult.indexOf("</strong>页");
        String pagesStr = singleWebSecourceResult.substring(start + "</font>/".length(), end);
        int pages = Integer.parseInt(pagesStr);
        String[] strings = new String[pages];
        strings[0] = pic + "/index.html";
        String list = new String("/list_");
        for (int i = strings.length; i > 1; i--) {
            strings[i - 1] = new String(pic + list + (pages - i + 1) + ".html");
        }
        return strings;
    }

    private String translateNum(int pic) {
        String picNum = pic < 10 ? "0" + pic : pic + "";
        return picNum;
    }

}
