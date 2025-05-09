// First interface
interface Animal {
 void eat();
}
// Second interface
interface Vehicle {
 void drive();
}
// Class implementing both interfaces
class AnimalVehicle implements Animal, Vehicle {
 @Override
 public void eat() {
 System.out.println("Animal is eating.");
 }
 @Override
 public void drive() {
 System.out.println("Vehicle is being driven.");
 }
 void move() {
 System.out.println("AnimalVehicle is moving.");
 }
}
public class Main {
 public static void main(String[] args) {
 AnimalVehicle av = new AnimalVehicle();
 av.eat(); // Calls the eat method from Animal interface
 av.drive(); // Calls the drive method from Vehicle interface
 av.move(); // Calls the move method from AnimalVehicle class
 }
}
