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

        System.out.println("Sur Kat:");
        kat.showMood(true);

        System.out.println("Glad kat:");
        kat.showMood(true);

        System.out.println("Sur hund:");
        hund.showMood(false);


        System.out.println("Glad hund:");
        hund.showMood(true);

    }

}
