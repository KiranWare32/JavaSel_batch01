import java.util.ArrayList;
import java.util.List;

public class Listeg {
    public static void main(String[] args)
    {
        List<String> students = new ArrayList<>();

        //Add the elements
        students.add("John");
        students.add("Alice");
        students.add("Sam");
        students.add("John");

        //Print the list
        System.out.println(students);

        //accessing an element
        System.out.println(students.get(2));

        //remove an element
        students.remove("Alice");
        System.out.println(students);

        //size of the list
        System.out.println(students.size());

        //contains
        boolean isPresent = students.contains("Sam");
        System.out.println(isPresent);

    }
}
