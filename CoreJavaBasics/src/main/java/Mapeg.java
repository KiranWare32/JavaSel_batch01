import java.util.HashMap;
import java.util.Map;

public class Mapeg {
    public static void main(String[] args)
    {
        Map<Integer, String> stds = new HashMap<>();

        //adding key value pairs
        stds.put(101, "John");
        stds.put(102, "Alice");
        stds.put(103, "Sam");

        //Print
        System.out.println(stds);

        //getting the values using key
        System.out.println(stds.get(102));

        //remove
        System.out.println(stds.remove(102));
        System.out.println(stds);

        //size
        System.out.println(stds.size());

    }
}
