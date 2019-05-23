import java.io.IOException;

public class callBat {
    public static void batStatic() {
        String bat_static = "./batstaticIP.sh.command";
        try {
            Runtime.getRuntime().exec(bat_static);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batDhcp(){
        String bat_dhcp = "./batdhcp.sh.command";
        try {
            Runtime.getRuntime().exec(bat_dhcp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void batgetinfo(){
        String bat_getinfo = "sh sudo ls";
        try {
            Runtime.getRuntime().exec(bat_getinfo);
            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}