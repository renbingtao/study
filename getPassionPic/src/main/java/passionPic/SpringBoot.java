package passionPic;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpringBoot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        GetPic bean = applicationContext.getBean(GetPic.class);
        bean.execute("骚");
    }

    @Test
    public void testChinese() {
        String str = "你好中国";
        String s = "你";
        System.out.println(str.matches("(.*)" + s + "(.*)"));
    }

    private String getStrDemo() {
        String str = new String("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "<title>在出租套房幹17歲嫩妹【16P】  - 色狼窝</title>\n" +
                "<meta name=\"Keywords\" content=\"在出租套房幹17歲嫩妹【16P】,色狼窝\" />\n" +
                "<meta name=\"Description\" content=\"色狼窝\" />\n" +
                "<link href=\"/css/css.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
                "</head>\n" +
                "<script>\n" +
                "function addfavorite()\n" +
                "{\n" +
                "   if (document.all)\n" +
                "   {\n" +
                "      window.external.addFavorite('http://352cc.com/','352cc.com');\n" +
                "   }\n" +
                "   else if (window.sidebar)\n" +
                "   {\n" +
                "      window.sidebar.addPanel('352cc.com', 'http://352cc.com/', \"\");\n" +
                "   }\n" +
                "} \n" +
                "</script>\n" +
                "<body>\n" +
                "<div id=\"body\">\n" +
                "<!-- 主体内容开始 -->\n" +
                "<div class=\"header\">\n" +
                "<div class=\"logo\">473YY.COM</div>\n" +
                "     <div class=\"search\"><font size=0 color=ffffff><script language='javascript' src='/sxgg/fj.js'></script></font>\n" +
                "<div class=vpic></div><div class=vpic1></div></div>\n" +
                "<div style=\"clear:both\"></div></div>\n" +
                "<div class=\"menu\">\n" +
                "<ul>\n" +
                "<li><a href=\"/\" class=\"a2\">激情图区</a></li>\n" +
                "<li><a href=\"/PIC01/index.html\">偷窥自拍</a></li>\n" +
                "<li><a href=\"/PIC02/index.html\">亚洲色图</a></li>\n" +
                "<li><a href=\"/PIC03/index.html\">欧美色图</a></li>\n" +
                "<li><a href=\"/PIC04/index.html\">动漫图片</a></li>\n" +
                "<li><a href=\"/PIC05/index.html\">美腿丝袜</a></li>\n" +
                "<li><a href=\"/PIC06/index.html\">清纯唯美</a></li>\n" +
                "<li><a href=\"/PIC07/index.html\">激情明星</a></li>\n" +
                "<li><a href=\"/PIC08/index.html\">乱伦图区</a></li>\n" +
                "<li><a href=\"/PIC09/index.html\">另类图片</a></li>\n" +
                "<li><a href=\"/PIC10/index.html\">套图超市</a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"menu\">\n" +
                "<ul>\n" +
                "<li><a href=\"/\" class=\"a2\">情色小说</a></li>\n" +
                "<li><a href=\"/TXT01/index.html\">激情文学</a></li>\n" +
                "<li><a href=\"/TXT02/index.html\">乱伦文学</a></li>\n" +
                "<li><a href=\"/TXT03/index.html\">淫色人妻</a></li>\n" +
                "<li><a href=\"/TXT04/index.html\">武侠古典</a></li>\n" +
                "<li><a href=\"/TXT05/index.html\">迷情校园</a></li>\n" +
                "<li><a href=\"/TXT06/index.html\">长篇小说</a></li>\n" +
                "<li><a href=\"/TXT07/index.html\">意淫强奸</a></li>\n" +
                "<li><a href=\"/TXT08/index.html\">另类小说</a></li>\n" +
                "<li><a href=\"/TXT09/index.html\">黄色笑话</a></li>\n" +
                "<li><a href=\"/TXT10/index.html\">性爱技巧</a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"menu\">\n" +
                "<ul>\n" +
                "<li><a href=\"/\" class=\"a2\">在线影院</a></li>\n" +
                "<li><a href=\"/VOD01/index.html\">亚洲情色</a></li>\n" +
                "<li><a href=\"/VOD02/index.html\">国产情色</a></li>\n" +
                "<li><a href=\"/VOD03/index.html\">成人动漫</a></li>\n" +
                "<li><a href=\"/VOD04/index.html\">欧美性爱</a></li>\n" +
                "<li><a href=\"/VOD05/index.html\">制服丝袜</a></li>\n" +
                "<li><a href=\"/VOD06/index.html\">艳舞写真</a></li>\n" +
                "<li><a href=\"/VOD07/index.html\">经典三级</a></li>\n" +
                "<li><a href=\"/VOD08/index.html\">强奸乱伦</a></li>\n" +
                "<li><a href=\"/VOD09/index.html\">另类变态</a></li>\n" +
                "<li><a href=\"/VOD10/index.html\">同性性爱</a></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"menu\">\n" +
                "<ul>\n" +
                "<li><a href=\"/\" class=\"a2\">在线视频</a></li>\n" +
                "<li><a href=\"/MOVIE01/index.html\">日韩ＡＶ</a></li>\n" +
                "<li><a href=\"/MOVIE02/index.html\">欧美ＡＶ</a></li>\n" +
                "<li><a href=\"/MOVIE03/index.html\">国产ＡＶ</a></li>\n" +
                "<li><a href=\"/MOVIE04/index.html\">动画ＡＶ</a></li>\n" +
                "<li></li>\n" +
                "<li></li>\n" +
                "<li></li>\n" +
                "<li></li>\n" +
                "<li></li>\n" +
                "<li></li>\n" +
                "</ul>\n" +
                "</div>\n" +
                "<div class=\"banner\"><script language='javascript' src='/sxgg/12.js'></script></div>\n" +
                "<div class=\"part1\">\n" +
                "     <div class=\"wide\">\n" +
                "          <div class=\"box\">\n" +
                "               <div class=\"tit\"><strong class=\"n link\">当前位置：<a href=\"/\" target=\"_self\">首页</a> &gt;&gt;&gt; <a href=\"/PIC05/index.html\" target=\"_blank\">美腿丝袜</a> &gt;&gt;&gt; <a href=\"/html/PIC05/390602.html\">在出租套房幹17歲嫩妹【16P】</a> </strong></div>\n" +
                "          <div class=\"box1\">\n" +
                "<div class=goto1><span class=\"dcs2\"><strong>[上一篇:<a href=/html/PIC05/390603.html>极品母狗，制服诱惑，期待你是那个幸运的人2【16P】</a>]  </strong></span><span class=\"dcs1\"><strong> [下一篇:<a href=/html/PIC05/390601.html>在出租套房幹17歲嫩妹2【16P】</a>]</strong></span></div>\n" +
                "</div>\n" +
                "<div class=introtxt>\n" +
                "<div class=vpic2></div><div class=vpic3>&nbsp;</div><div class=vpic4><font size=3 color=000000>紧急通知：请记住我们多个域名，将 <font color=F20940>352cc.com</font> <a href=\"#\" onclick=\"addfavorite()\"><strong><font color=0919F2>加入收藏夹</font></strong></a>!</font></div>\n" +
                "<div class=temp23>\n" +
                "<a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/01.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/01.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/02.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/02.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/03.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/03.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/04.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/04.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/05.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/05.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/06.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/06.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/07.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/07.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/08.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/08.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/09.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/09.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/10.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/10.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/11.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/11.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/12.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/12.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/13.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/13.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/14.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/14.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/15.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/15.jpg\" border=\"0\"></a><br><a href=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/16.jpg\" target=\"_blank\"><img src=\"http://s1bfd.d39jcrlyy.com/180101/%E7%BE%8E%E8%85%BF%E4%B8%9D%E8%A2%9C/%E5%9C%A8%E5%87%BA%E7%A7%9F%E5%A5%97%E6%88%BF%E5%B9%B917%E6%AD%B2%E5%AB%A9%E5%A6%B9[16P]/16.jpg\" border=\"0\"></a><br>\n" +
                "</div>\n" +
                "<div class=vpic><font size=3 color=000000>紧急通知：请记住我们多个域名，将 <font color=F20940>352cc.com</font> <a href=\"#\" onclick=\"addfavorite()\"><strong><font color=0919F2>加入收藏夹</font></strong></a>!</font></div><div class=vpic1>&nbsp;</div>\n" +
                "</div>\n" +
                "<div class=goto1><span class=\"dcs2\"><strong>[上一篇:<a href=/html/PIC05/390603.html>极品母狗，制服诱惑，期待你是那个幸运的人2【16P】</a>]  </strong></span><span class=\"dcs1\"><strong> [下一篇:<a href=/html/PIC05/390601.html>在出租套房幹17歲嫩妹2【16P】</a>]</strong></span></div>\n" +
                "          </div>\n" +
                "\n" +
                "     </div>\n" +
                "     \n" +
                "     \n" +
                "</div>\n" +
                "<div class=\"banner\"><script language='javascript' src='/sxgg/13.js'></script></div>\n" +
                "</div>\n" +
                "<div style=\"display:none;\"><script language='javascript' src='/sxgg/tj.js'></script></div>\n" +
                "</body>\n" +
                "</html>");
        return str;
    }

    @Test
    public void stringPattern() {
        String regex = "<a href=(.*)(^((?!<a href=).)*$)(.*) target=_blank><img src=(.*)(^((?!<img src=).)*$)(.*) border=0></a>";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(getStrDemo().replace("\n", " ").replace("\"", ""));
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }


}
