import java.util.Scanner;
public class example{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int num = sc.nextInt();
     if(num<0){
         System.out.println("Negative number");
         }
     else if(num>0){
         System.out.println("Positive number");
         }
     else{
         System.out.println("Zero");
         }
     }

}