import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readtxtfile {
    public static void main(String[] args)
    {
        try{
            FileReader file = new FileReader("src/main/Student.txt");

            BufferedReader reader = new BufferedReader(file);

            String line;

            while ((line=reader.readLine()) !=null)
            {
                System.out.println(line);
            }

            reader.close();
        }
        catch(IOException e)
        {
            System.out.println("Error reading file");
        }
    }
}
