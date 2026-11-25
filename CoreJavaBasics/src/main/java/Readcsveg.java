import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readcsveg {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/Employee.csv"));

            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");
                for (String value : data) {
                    System.out.println(value + " ");
                }

                reader.close();
            }
        }
            catch(IOException e)
            {
                System.out.println("Error reading csv file");
            }
    }
}
