import java.util.Scanner;
public class quadraric
{
  public static void main(String[] args)
  {
  Scanner scanner=new Scanner(System.in);
  
  System.out.println("enter the value of a: ");
  double a=scanner.nextDouble(); 
  
  System.out.println("enter value of b: ");
    double b=scanner.nextDouble(); 

   System.out.println("enter value of c: ");
     double c=scanner.nextDouble(); 

   double discriminent=b*b-4*a*c;
   
   if(discriminent>0)
   {
	   double root1=(-b+Math.sqrt(discriminent))/(2 * a);
	   double root2=(b-Math.sqrt(discriminent))/(2 * a);
	   System.out.println("the eqn has two real solns:");
	   System.out.println("Root 1: "+root1);
	   System.out.println("Root 2:"+root2);
   }
   else if(discriminent==0)
   {
	   double root=-b/(2*a);
	   System.out.println("the eqn has onereal soln");
	   System.out.println("Root : "+root);
   }else
   {
	   System.out.println("the eqn has no real soln");
}
   scanner.close();
  }
}