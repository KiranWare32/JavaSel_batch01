
class BankAcc
{
    //private variable
    private int bal = 1000;

    //get method
    public int getBal()
    {
        return bal;
    }
    //set the balance
    public void setBal(int amount)
    {
        bal = amount;
    }

}


public class Bankeg {
    public static void main(String[] args)
    {
        BankAcc b1 = new BankAcc();
        //getting the balance
        System.out.println("Old balance " + b1.getBal());
        //update the balane
        b1.setBal(2000);
        //get the updated balance
        System.out.println("New balance " + b1.getBal());



    }
}
