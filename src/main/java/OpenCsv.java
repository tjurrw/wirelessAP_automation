import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class OpenCsv {
    public ArrayList<ArrayList<String>> openCsv(String filename) {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        try {
            File f = new File("./", filename + ".csv");
            BufferedReader p = new BufferedReader(new FileReader(f));

            String line; //
            while ((line = p.readLine()) != null) {
                ArrayList<String> record = new ArrayList<>();
                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {
                    record.add(st.nextToken());
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