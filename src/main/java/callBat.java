import java.io.IOException;

public class callBat {
    public static void batStatic() {
        String bat_static = "./batstaticIP.sh.command";
        try {
            Runtime.getRuntime().exec(bat_static);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void batDhcp(){
        String bat_dhcp = "./batdhcp.sh.command";
        try {
            Runtime.getRuntime().exec(bat_dhcp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void batgetinfo(){
        String bat_getinfo = "./batgetinfo.sh.command";
        try {
            Runtime.getRuntime().exec(bat_getinfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}