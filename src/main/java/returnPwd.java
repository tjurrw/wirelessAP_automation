public class returnPwd {
    public String returnPwd(String ssid, String ip, String admin, String adminPwd){
        String rtnPwd = ssid + ip + admin + adminPwd;
        return rtnPwd;
    }
}