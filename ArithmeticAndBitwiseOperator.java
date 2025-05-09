public class ArithmeticAndBitwiseOperations {
 public static void main(String[] args) {
 // Arithmetic operations
 int num1 = 10;
 int num2 = 5;
 int sum = num1 + num2;
 int difference = num1 - num2;
 int product = num1 * num2;
 int quotient = num1 / num2;
 int remainder = num1 % num2;
 System.out.println("Arithmetic Operations:");
 System.out.println("Sum: " + sum);
 System.out.println("Difference: " + difference);
 System.out.println("Product: " + product);
 System.out.println("Quotient: " + quotient);
 System.out.println("Remainder: " + remainder);
 // Bitwise operations
 int num3 = 12;
 int num4 = 6;
 int bitwiseAnd = num3 & num4;
 int bitwiseOr = num3 | num4;
 int bitwiseXor = num3 ^ num4;
 int bitwiseComplementNum3 = ~num3;
 int bitwiseLeftShift = num3 << 2;
 int bitwiseRightShift = num3 >> 2;
 System.out.println("\nBitwise Operations:");
 System.out.println("Bitwise AND: " + bitwiseAnd);
 System.out.println("Bitwise OR: " + bitwiseOr);
 System.out.println("Bitwise XOR: " + bitwiseXor);
 System.out.println("Bitwise Complement of num3: " + bitwiseComplementNum3);
 System.out.println("Bitwise Left Shift: " + bitwiseLeftShift);
 System.out.println("Bitwise Right Shift: " + bitwiseRightShift);
 }
