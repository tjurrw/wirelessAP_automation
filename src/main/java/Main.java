import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        String bldgname; //ビルの名前
        int nor; //部屋の数

        System.out.println("Please input information");
        Scanner scan = new Scanner(System.in);

        bldgname = scan.nextLine(); // ビルの名前を入力
        nor = scan.nextInt(); //部屋の数を入力

        System.out.println(bldgname);
        System.out.println(nor);

        DataConfiguration[] a = new DataConfiguration[nor]; //部屋の数分の配列要素を生成

        for(int i = 0; i < nor; i++) {
            a[i] = new DataConfiguration();
            a[i].ssid = bldgname + scan.nextInt(); //방 이름을 직접 입력
            a[i].localip = "192.168.76." + (20 + i);
        }
        //各部屋にlocal ipアドレスを指定

        Sample s = new Sample();
        callBat b = new callBat();
        for(DataConfiguration tmp : a){
            s.inputCsv(tmp);
            b.batStatic();
            System.out.print("continue? : [Y/n]");
            String flag = scan.nextLine();
            b.batDhcp();
            if (flag != "Y") {
                break;
            }
        }
        //機器作成が終了したらYを入力
    }
}

/*
import java.util.Scanner;
import OutputCsv;

public class Main {
    public static void main(String[] args) {
        String bldgname; //빌딩이름
        int nor; //방 갯수
        String admin_name; //관리화면 아이디
        String admin_pw; //관리화면 비밀번호

        System.out.println("Please input information");
        Scanner scan = new Scanner(System.in);

        bldgname = scan.nextLine(); // 빌딩 이름 입력
        nor = scan.nextInt(); //방 갯수 입력

        System.out.println(bldgname);
        System.out.println(nor);

        DataConfiguration[] a = new DataConfiguration[nor];

        for(int i = 0; i < nor; i++) {
            a[i] = new DataConfiguration();
            a[i].ssid = bldgname + i;
            a[i].localip = "192.168.76." + (20 + i);
        }

        OutputCsv oc = new OutputCsv(bldgname);
        oc.Output(a);


        // for(int i = 0; i < nor; i++){
        //     System.out.println(a[i].ssid + "\t" + a[i].localip);
        // }
    }
}

class DataConfiguration{
    public String ssid;
    public String localip;
}*/