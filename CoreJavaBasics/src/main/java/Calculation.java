public class Calculation {
    public static void main(String[] args){
        int quantity = 3;
        double price = 19.99;
        String productName = "Claw Hammer";
        var total = quantity * price;// Java works out the type: double

        System.out.println(productName + " x" + quantity + " = " + total);
        System.out.printf("Total: £%.2f%n", total);
    }



}
