package homework;

//Interface
interface Vehicle {
 // Constant (implicitly public static final)
 String TYPE = "Transport";

 // Abstract method (no body)
 void start();

 // Default method (Java 8+)
 default void stop() {
     System.out.println("Vehicle stopped.");
 }

 // Static method (Java 8+)
 static void honk() {
     System.out.println("Beep beep!");
 }
}

//Class implementing the interface
class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car started.");
 }
}

public class Interface {
 public static void main(String[] args) {
     Car car = new Car();
     car.start();  // Overridden method
     car.stop();    // Inherited default method
     Vehicle.honk(); // Static method call
     System.out.println("Type: " + Vehicle.TYPE); // Constant
 }
}
