class Calculator
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b,double c)
    {
        System.out.println(a+b+c);
    }
    void add(double a , double b)
    {
        System.out.println(a+b);
    }
}




public class Polyoverloading {
    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        c.add(10,20);
        c.add(23.99,45.89);
        c.add(23,56,78.54);
    }
}
