class Arithmeticoperations
{
public int add(int num1, int num2){
return num1 + num2;
}
public int subtract(int num1 , int num2){
return num1 - num2;
}
public int multiply(int num1, int num2){
return num1 * num2;
}
public int divide(int num1 , int num2){
return num1 / num2;
}
public int modulus(int num1 , int num2){
return num1 % num2;
}
}

 class Bitwiseoperations{
	public int bitwiseAnd(int num1 , int num2){
	return num1 & num2;
}
public int bitwiseOr(int num1 , int num2){
	return num1 | num2;
}
public int bitwiseXor(int num1 , int num2){
	return num1 ^ num2;
}
public int bitwisecomplement(int num1){
	return ~num1;
}
public int bitwiseLeftshift(int num1 , int shift){
	return num1 << shift;
}
public int bitwiseRightshift(int num1 , int shift){
	return num1 >> shift;
}
}
 class Main{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 5;
		
		Arithmeticoperations arithmetic = new Arithmeticoperations();
		Bitwiseoperations bitwise = new Bitwiseoperations();
		
		int sum = arithmetic.add(num1,num2);
		int difference = arithmetic.subtract(num1,num2);
		int product = arithmetic.multiply(num1,num2);
		int quotient = arithmetic.divide(num1,num2);
		int remainder = arithmetic.modulus(num1,num2);
		
int bitwiseAnd = bitwise.bitwiseAnd(num1,num2);
int bitwiseOr = bitwise.bitwiseOr(num1,num2);
int bitwiseXor = bitwise.bitwiseXor(num1,num2);
int bitwisecomplementNum1 = bitwise.bitwisecomplement(num1);
int bitwiseLeftshift = bitwise.bitwiseLeftshift(num1,1);
int bitwiseRightshift = bitwise.bitwiseRightshift(num1,1);

System.out.println("Arithmeticoperations");
System.out.println("Sum" + sum);
System.out.println("Difference" + difference);
System.out.println("Product"  + product);
System.out.println("Quotient" + quotient);
System.out.println("Remainder" + remainder);

System.out.println("\n Bitwiseoperations");
System.out.println("Bitwise And" + bitwiseAnd);
System.out.println("Bitwise Or" + bitwiseOr);
System.out.println("Bitwise Xor" + bitwiseXor);
System.out.println("Bitwise complement of num1" + bitwisecomplementNum1);
System.out.println("Bitwise Left Shift" + bitwiseLeftshift);
System.out.println("Bitwise Right Shift" + bitwiseRightshift);
	}
}
