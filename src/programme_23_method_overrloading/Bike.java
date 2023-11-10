package programme_23_method_overrloading;

/**
 * Creating a child class
 */
public class Bike extends Vehicle {
    // Defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike(); // creating object
        obj.run(); // calling method
    }


}
