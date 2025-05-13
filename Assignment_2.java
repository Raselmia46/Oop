package cpn;

//Interface example
interface Animal {
 void makeSound();
}

class Dog implements Animal {
 public void makeSound() {
     System.out.println("Dog says: Woof!");
 }
}

//Abstract class example
abstract class Vehicle {
 abstract void startEngine();
}

class Car extends Vehicle {
 void startEngine() {
     System.out.println("Car engine started.");
 }
}

public class Assignment_2 {
 public static void main(String[] args) {
     // Interface method call
     Animal myDog = new Dog();
     myDog.makeSound();

     // Abstract class method call
     Vehicle myCar = new Car();
     myCar.startEngine();
 }
}
