package top.misec.login;

/**
 * @author Junzhou Liu
 * @create 2020/10/11 16:49
 */
public class Verify {

    private static String userId = "";
    private static String sessData = "";
    private static String biliJct = "";
    private static String buvid3 = "";


    private final static Verify VERIFY = new Verify();

    public Verify() {

    }

    /**
     * Cookies信息 从浏览器获取
     *
     * @param userId   uid
     * @param sessData sessData
     * @param biliJct  biliJct or CSRF
     */
    public static void verifyInit(String userId, String sessData, String biliJct,String buvid3) {
        Verify.userId = userId;
        Verify.sessData = sessData;
        Verify.biliJct = biliJct;
        Verify.buvid3 = buvid3;
    }


    public static Verify getInstance() {
        return VERIFY;
    }

    public String getUserId() {
        return userId;
    }

    public String getSessData() {
        return sessData;
    }

    public String getBiliJct() {
        return biliJct;
    }
    
    public String getBuvid3() {
        return buvid3;
    }

    public String getVerify() {
        return "\"bili_jct=" + getBiliJct() + ";SESSDATA=" + getSessData() + ";DedeUserID=" + getUserId() + ";Buvid3=" + getBuvid3();
    }
}
