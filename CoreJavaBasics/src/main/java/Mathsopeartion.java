class Rectangle
{
    int length;
    int width;

    void calculate()
    {
        int area = length * width;
        System.out.println("Area is: " + area);
    }
}

public class Mathsopeartion {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 20;

        Rectangle r2 = new Rectangle();
        r2.length = 23;
        r2.width = 76;

        r1.calculate();
        r2.calculate();
    }
}
