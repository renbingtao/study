
public class Start {

    public static void main(String[] args) {
        try {
            String s = new String("å\u008D\u008Eåº·å°\u0091å¥³æ\u0096\u0087å\u00AD");
            byte[] westerns = s.getBytes("iso8859-1");
            String string = new String(westerns, "utf-8");
            System.out.println(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
