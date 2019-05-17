import java.io.*;

public class openCsv {
    public static void openCsv(String filename){
        String[][] data = new String[100][4];

        try {
            File f = new File("/Users/parkchikook/IdeaProjects/selenium_test/src/main/java", filename);
            BufferedReader p = new BufferedReader(new FileReader(f));

            String line = p.readLine(); //1行ずつCSVファイルを読み込む

            for(int row = 0; line != null; row++){
                data[row] = line.split(",", 0);
                line = p.readLine();
            }

            p.close();

            for(int row = 0; row < data.length; row++) {
                System.out.println();
                for(int col = 0; col < 4; col++) {
                    System.out.print(data[row][col]);
                    System.out.print(",");
                    }
                }
            }

            catch (IOException e) {
                e.printStackTrace();
        }
    }
}