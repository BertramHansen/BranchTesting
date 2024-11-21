import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Animal hund = new Dog("Fiddo");
        Animal kat = new Cat("Sofus");


        System.out.println("Dog says:");
        hund.makeSound();

        System.out.println("Cat says:");
        kat.makeSound();

        hund.eat("Kødben");

        kat.eat("Fisk");


    }

}
