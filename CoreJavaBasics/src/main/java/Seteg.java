import java.util.HashSet;
import java.util.Set;

public class Seteg {
    public static void main(String[] args)
    {
        Set<Integer> empid = new HashSet<>();

        //adding elements
        empid.add(101);
        empid.add(102);
        empid.add(103);
        empid.add(104);
        empid.add(101);

        //Print all elements
        System.out.println(empid);

        //check an element
        System.out.println(empid.contains(103));

        //delete/remove an element
        empid.remove(102);
        System.out.println(empid);


        //size
        System.out.println(empid.size());

    }
}
