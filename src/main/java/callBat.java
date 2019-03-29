import java.io.IOException;

public class callBat {
    public void batStatic() {
        String bat_static = "cmd.exe /c start C:\\Users\\outsourcing006\\Desktop\\(外付)2.180.bat - ショートカット";
        try {
            Runtime.getRuntime().exec(bat_static);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void batDhcp(){
        String bat_dhcp = "cmd.exe /c start C:\\Users\\outsourcing006\\Desktop\\auto.bat - ショートカット";
        try {
            Runtime.getRuntime().exec(bat_dhcp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}