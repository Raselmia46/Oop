package cpn;

//Abstract Class
abstract class Animal {
 // Field (can be instance-specific)
 protected String name;

 // Constructor (allowed in abstract class)
 public Animal(String name) {
     this.name = name;
 }

 // Concrete method (implemented)
 public void eat() {
     System.out.println(name + " is eating.");
 }

 // Abstract method (unimplemented - must be overridden)
 public abstract void makeSound();
}

//Concrete subclass
class Dog extends Animal {
 public Dog(String name) {
     super(name); // Calls Animal's constructor
 }

 @Override
 public void makeSound() {
     System.out.println(name + " says: Woof!");
 }
}

public class abstruction {
 public static void main(String[] args) {
     Animal dog = new Dog("Buddy");
     dog.eat();       // Inherited concrete method
     dog.makeSound(); // Overridden abstract method
 }
}