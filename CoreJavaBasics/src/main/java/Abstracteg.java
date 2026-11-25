//abstract class with have abstract and non abstract methods
abstract class Animals
{
    abstract void sound();

    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Dogs extends Animals
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}


public class Abstracteg {
    public static void main(String[] args)
    {
        Dogs d = new Dogs();
        d.sound();
        d.sleep();
    }
}
