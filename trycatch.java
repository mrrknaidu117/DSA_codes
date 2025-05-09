public class Main {
 public static void main(String[] args) {
 try {
 // Code that may throw exceptions
 int[] numbers = {1, 2, 3};
 int result = numbers[4] / 0; // This will throw an ArithmeticException
 } catch (ArithmeticException e) {
 // Catch block for ArithmeticException
 System.out.println("ArithmeticException caught: " + e.getMessage());
 } catch (ArrayIndexOutOfBoundsException e) {
 // Catch block for ArrayIndexOutOfBoundsException
 System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
 } catch (Exception e) {
 // Catch block for other exceptions
 System.out.println("Exception caught: " + e.getMessage());
 }
 // Rest of the program
 System.out.println("Program continues after exception handling.");
 }}