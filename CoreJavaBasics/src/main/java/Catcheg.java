public class Catcheg {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

            int[] numbers = {10, 20, 30};

            System.out.println(5);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            System.out.println("Finally block exceuted");
        }
        System.out.println("Program complete");
    }
}