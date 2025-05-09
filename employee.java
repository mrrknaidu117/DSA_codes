import java.util.Scanner;
public class employee
{
  public static void main(String[] args)
  {
  Scanner scanner=new Scanner(System.in);
  
  System.out.println("enter employee name: ");
  String name=scanner.nextLine();
  
  System.out.println("enter employee age: ");
   int age=scanner.nextInt();
   
   System.out.println("enter employee salary: ");
   double salary=scanner.nextDouble();
   
   System.out.println("enter employee designation: ");
   String designation=scanner.next();
   
   System.out.println("employee details: ");
   System.out.println("name: " +name);
   System.out.println("age: "+age);
   System.out.println("salary: "+salary);
   System.out.println("designation: "+designation);
   
   scanner.close();
  }
}