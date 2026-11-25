interface Payment
{
    void pay();

}

class Creditcard implements Payment
{
    public void pay()
    {
        System.out.println("Payment made using credit card");
    }
}

class Googlepay implements Payment
{
    public void pay()
    {
        System.out.println("Payment made using Google pay");
    }
}


public class Interfaceeg {
    public static void main(String[] args)
    {
        Creditcard c = new Creditcard();
        Googlepay g = new Googlepay();

        c.pay();
        g.pay();
    }
}
