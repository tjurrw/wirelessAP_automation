import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class OpenCsv {
    public ArrayList<ArrayList<String>> openCsv(String filename) {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        try {
            File f = new File("./", filename + ".csv");
            BufferedReader p = new BufferedReader(new FileReader(f));

            String line; //
            while ((line = p.readLine()) != null) {
                ArrayList<String> record = new ArrayList<>(); //line = p.readLine()를 수용
                String[] st = line.split(",", 0);
                for(int i = 0; i < 3; i++){
                    record.add(st[i]);
                }

                data.add(record);
            }

            p.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}