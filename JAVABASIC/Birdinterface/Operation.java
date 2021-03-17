package Birdinterface;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        Duck d = new Duck();
        ArrayList<Bird> al = new ArrayList<Bird>();
        al.add(p);
        al.add(d);
        Bird.display();
        for (Bird b : al){
            b.eat();
            b.fly();
            b.swim();
        }
    }
}