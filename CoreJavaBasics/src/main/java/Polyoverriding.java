//Parent class
class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

//child class
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }
}

//child class
class Cat extends Animal
{
    void sound()
    {
        System.out.println("Cat meows");
    }
}



public class Polyoverriding {
    public static void main(String[] args)
    {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();
        a1.sound();
        a2.sound();
        a3.sound();
    }
}
