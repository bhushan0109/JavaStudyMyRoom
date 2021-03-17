package OppsDifination;
class CFG {
    CFG() { System.out.println("Vehicle is created."); }
    static int a=12;
}

class Bike extends CFG {

    Bike() { System.out.println("Bike is created."); }

    Bike(String brand)
    {
       // super(); // it calls Vehicle(), the parent class
        // constructor of class Bike
        this();
        System.out.println("Bike brand is " + brand);
    }
}

class GFG {
    public static void main(String args[])
    {
        Bike bike = new Bike("Honda");

    }
}