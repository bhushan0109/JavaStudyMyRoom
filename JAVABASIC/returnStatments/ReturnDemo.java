package returnStatments;

public class ReturnDemo {

    public static void main(String[] args) {
         calculate(2, 93);
        //System.out.println("z = " + z);

        Dog dog = new Dog("Spaniel", "Doggie");
        System.out.println(dog.getDog());
        //System.out.println(calculate(4, 7));  
    }

    public static void calculate(int x, int y) {
        // return an int type value
        int z= x + y;
        System.out.println("z = " + z);
    }

    public void print() {
        System.out.println("void method");

        // it does not need to contain a return statement, but it
        // may do so
        return;
    }

    public String getString() {
        return "return String type value";

        // try to execute a statement after return a value will
        // cause a compile-time error.
        //
        // String error = "error";
    }
}

class Dog {
    private String breed;
    private String name;

    Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public Dog getDog() {
        // return Dog type
        return this;
    }

    public String toString() {
        return "breed: " + breed.concat("name: " + name);
    }
}