class Students
{
    private String name;
    private int age;

    //Setter for name
    void setName(String n)
    {
        name = n;
    }

    //Getter for name
    String getName()
    {
        return name;
    }
    //Setter for age
    void setAge(int a)
    {
        age = a;
    }
    //Getter for name
    int getAge()
    {
        return age;
    }


}

public class GetSeteg {
    public static void main(String[] args)
    {
       Students s1 = new Students();

       //setting values
        s1.setName("ABC");
        s1.setAge(23);

        //get the values
        System.out.println("Name is: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
