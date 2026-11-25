class Student{
    int id;
    String fname;
    String lname;

        public Student(int id, String fname, String lname)
        {
            this.id = id;
            this.fname = fname;
            this.lname = lname;
        }
}
public class Main {
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"ABC","XYZ");
        System.out.println(s1.id);
        System.out.println(s1.fname);
        System.out.println(s1.lname);
    }
}
