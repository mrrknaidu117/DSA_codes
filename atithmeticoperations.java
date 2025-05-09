class atithmeticoperations
{
public int add(int num1,num2);
{
return num1+num2;
}
public int subtract(int num1,int num2)
{
return num1-num2;
}
public int multiply(int num1,num2)
{
return num1*num2;
}
public int divide(int num1,num2)
{
return num1 / num2;
}
public int modulus(int num1,num2)
{
return num1 % num2;
}
}

public class bitwiseoperator
{
public int bitwiseAnd(int num1,num2)
{
return num1 & num2;
}
public int bitwiseor(int num1,num2)
{
return num1 | num2;
}
public int bitwisexor(int num1,num2)
{
return num1 ^ num2;
}
public int bitwisecomplnum1(int num1)
{
return ~num1;
public int bitwiseleftshift(int num1,int shift)
{
return num1<<shift;
}
public int bitwiserightshift(int num1,int shift)
{
return num1>>shift;
}
}

public class main
{
public static void main(String[] args)
{
int num1=10;
int num2=5;
arithmeticoperations arithmetic=new arithmeticoperations();
botwiseoperations bitwise =new bitwiseoperations();
int sum =arithmetic.add(num1,num2);
int difference =arithmetic.subtract(num1,num2);
int product=arithmetic.multiply(num1,num2);
int quotient=arithmetic.divide(num1,num2);
int reminder=arithmetic.modulus(num1,num2);

int bitwiseAnd =bitwise.bitwiseAnd(num1,num2);
int bitwiseor=bitwise.bitwiseor(num1,num2);
int bitwisexor=bitwise.bitwisexor(num1,num2);
int bitwisecomplnum1=bitwise.bitwisecompl(num1);
int bitwiseleftshift=bitwise.bitwiseleftshift(num1,1);
int bitwiserightshift=bitwise.bitwiserightshift(num1,1);

System.out.println("arithmetic operatoe: ");
System.out.println("sum: " +sum);
System.out.println("difference: " +difference);
System.out.println("product: " +product);
System.out.println("quotient: " +quotient);
System.out.println("remainder: " +remainder);

System.out.println("\nbitwise operations: ");
System.out.println("bitwise And: " +bitwiseAnd);
System.out.println("bitwise or: " +bitwiseor);
System.out.println("bitwise xor: " +bitwisexor);
System.out.println("bitwise complement of num1: " +bitwisecomplnum1);
System.out.println("bitwise leftshift: " +bitwiseleftshift);
System.out.println("bitwise rightshift: " +bitwiserightshift);
}
}