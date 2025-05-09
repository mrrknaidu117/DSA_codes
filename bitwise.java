public class bitwise
{
 public static void main(String[] args)
{
int num1=10;
int num2=5;
int bitwiseAnd=num1&num2;
int bitwiseOr=num1|num2;
int bitwiseXor=num1^num2;
int bitwisecomplementnum1=~num1;
int bitwiseleftshift=num1<<2;
int bitwiserightshift=num1>>2;

System.out.println("bitwise operations");
System.out.println("and " +bitwiseAnd);
System.out.println("or "+bitwiseOr);
System.out.println("comp "+bitwisecomplementnum1);
System.out.println("left "+bitwiseleftshift);
System.out.println("right "+bitwiserightshift);
System.out.println("xor "+bitwiseXor);
}
}