import java.io.IOException;

public class callBat {
    public void batStatic() {
        String bat_static = "./";
        try {
            Runtime.getRuntime().exec(bat_static);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void batDhcp(){
        String bat_dhcp = "./";
        try {
            Runtime.getRuntime().exec(bat_dhcp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}