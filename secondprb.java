import java.util.Scanner;
public class secondprb{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}