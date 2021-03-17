package Birdinterface;

public interface Bird {
    void fly();
    void eat();
    void swim();
    public static void display(){
        System.out.println("----------------bird program--------------");
    }

}
 class Duck implements Bird{
    @Override
    public void eat() {
        System.out.println("duck eatting");
    }
    public void fly(){
        System.out.println("duck fly");
    }
    public  void swim(){
        System.out.println("duck swim");
    }
}