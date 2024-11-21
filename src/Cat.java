public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("Spinder");

        }else{
            System.out.println("Hvæser");
        }
    }
}
