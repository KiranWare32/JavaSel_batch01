//Parent class
class Person
{
    String name;
    void introduce()
    {
        System.out.println("My name is " + name );
    }
}

//child class
class Pupil extends Person
{
  int rollno;
  void study()
  {
      System.out.println("Student is studying");
  }
}

public class Inheritanceeg {

    {
        Pupil p = new Pupil();
        p.name="Tom";
        p.rollno= 101;

        System.out.println("Roll number: " + p.rollno);
        p.introduce(); //parent class method
        p.study(); //child class method
    }
}
