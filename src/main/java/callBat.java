import java.io.IOException;

public class callBat {
    public void batStatic() {
        String bat_static = "cmd.exe /c start C:\\\\Users\\\\Administrator\\\\Desktop\\\\2.180";
        try {
            Runtime.getRuntime().exec(bat_static);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void batDhcp(){
        String bat_dhcp = "cmd.exe /c start C:\\\\Users\\\\Administrator\\\\Desktop\\\\DHCP";
        try {
            Runtime.getRuntime().exec(bat_dhcp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}