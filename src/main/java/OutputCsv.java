import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class OutputCsv {
    public PrintWriter pw;

    public OutputCsv(String filename){
        try{
            FileWriter f = new FileWriter("C:\\Users\\outsourcing006\\Desktop\\" + filename);
            this.pw = new PrintWriter(new BufferedWriter(f));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } /* csvファイルを生成するコンストラクター */

    public void close(){
        try{
            this.pw.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /* 書込み終了 */

    public void Output(DataConfiguration[] a) {
        for (int i = 0; i < a.length; i++) {
            this.pw.print(a[i].ssid + "," + a[i].localip);
            this.pw.println();
        }
    }
    /* Main.javaで生成された配列aをpwに書込む */
}

/*생성된 CSV파일을 해당 HTML로 입력해야 한다*/

/*
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class OutputCsv {
    public PrintWriter pw;

    public OutputCsv(String fileName) {
        try {
            FileWriter f = new FileWriter("/User/parkchikook/IdeaProjects/JavaPractice/" + fileName);
            this.pw = new PrintWriter(new BufferedWriter(f));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public finalize() {
        this.pw.close();
    }

    public Output(DataConfiguration[] a) {
        for (int i = 0; i < a.length(); i++) {
            this.pw.print(a[i].ssid + "," + a[i].localip);
            this.pw.println();
        }
    }
}

OutputCsv oc = new OutputCsv(bldnname);

input
* */