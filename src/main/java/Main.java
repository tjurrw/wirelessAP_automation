import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String bldgname; //ビルの名前

        System.out.println("Please input information.");
        Scanner scan = new Scanner(System.in);

        bldgname = scan.nextLine(); //ビルの名前 入力

        System.out.println(bldgname);

        openCsv.openCsv(bldgname); //CSVデータ(ファイル名：建物名)生成
    }
}

/*
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        String bldgname; //ビルの名前
        int nor; //部屋の数

        System.out.println("Please input information");
        Scanner scan = new Scanner(System.in);

        bldgname = scan.nextLine(); //ビルの名前を入力
        nor = scan.nextInt(); //部屋の数を入力

        System.out.println(bldgname);
        System.out.println(nor);

        DataConfiguration[] a = new DataConfiguration[nor]; //部屋の数分の配列要素を生成

        for(int i = 0; i < nor; i++) {
            a[i] = new DataConfiguration();
            a[i].ssid = bldgname + scan.nextLine(); //방 이름을 직접 입력
            a[i].localip = "192.168.76." + (20 + i);
        }
        //各部屋にlocal ipアドレスを指定

        Sample s = new Sample();

        callBat b = new callBat();

        for(DataConfiguration tmp : a){
            b.batStatic(); //IPアドレス固定
            s.inputCsv(tmp);
            System.out.print("continue? : [Y/n]");
            String flag = scan.nextLine();
            if (flag != "Y") {
                b.batDhcp();
                break;
            }
            b.batDhcp(); //IPアドレス固定解除
        }
        //機器作成が終了したらYを入力

        try{
            FileWriter f = new FileWriter(bldgname);
            PrintWriter prw = new PrintWriter(new BufferedWriter(f));

            for(DataConfiguration tmp : a){
                prw.print(tmp.ssid); //ssid
                prw.print(",");
                prw.print(tmp.localip); //localIp
                prw.print(",");
                prw.print(""); //getPw
                prw.println();
            }

            prw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}*/