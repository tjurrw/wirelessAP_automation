import java.io.*;

public class openCsv {
    public static void openCsv(String filename){
        String[][] data = new String[100][4];

        try {
            File f = new File(filename);
            BufferedReader p = new BufferedReader(new FileReader(f));

            String line = p.readLine(); //1行ずつCSVファイルを読み込む

            for(int row = 0; line != null; row++){
                data[row] = line.split(",", 0);
                line = p.readLine();
            }

            p.close();

            }

            catch (IOException e) {
                e.printStackTrace();
            }
    }
}