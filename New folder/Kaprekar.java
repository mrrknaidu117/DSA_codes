import java.util.Scanner;

class Kaprekar{
    public  Kaprekar(int n){
        long num = (long)n*n;
        String squarestr = String.valueOf(num);
        int length  = squarestr.length();
        String leftpart = squarestr.substring(0,length/2);
        String rightpart = squarestr.substring(length/2);
        int left = (leftpart.isEmpty())?0:Integer.parseInt(leftpart);
        int right = (rightpart.isEmpty())?0:Integer.parseInt(rightpart);
        if (left + right == n)
            System.out.println(num + " -> " + left + " + " + right + " = " + n + " is a Kaprekar number");
        else
            System.out.println(num + " -> " + left + " + " + right + " ≠ " + n + " is not a Kaprekar number");

    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Kaprekar ka = new Kaprekar(number);

      sc.close();
    }
}