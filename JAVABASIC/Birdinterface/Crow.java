package Birdinterface;

abstract public class Crow implements  Bird{
    @Override
    public void eat() {
        System.out.println("crow eat");
    }

    @Override
    public void fly() {
        System.out.println("crow fly");
    }
}
class Penguin extends  Crow{
    @Override
    public void swim() {
        System.out.println("Penguin swim");
    }
}