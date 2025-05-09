class Animal {
 void makeSound() {
 System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {
 @Override
 void makeSound() {
 System.out.println("Dog barks");
 }
 void fetch() {
 System.out.println("Dog fetches a ball");
 }
 void play() {
 super.makeSound(); // Call the overridden method from the superclass
 fetch(); // Call the subclass method
 }
}
public class Main {
 public static void main(String[] args) {
 Animal animal = new Animal();
 Dog dog = new Dog();
 animal.makeSound(); // Calls the method in Animal class
 System.out.println("---");
 dog.makeSound(); // Calls the overridden method in Dog class
 System.out.println("---");
 dog.play(); // Calls the overridden method in Dog class and the subclass method
 }
}
