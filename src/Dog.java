public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("woof");
    }

    @Override
    public boolean eat(String foodType){
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("Logrer");

        }else{
            System.out.println("knurrer");
        }
    }
}
