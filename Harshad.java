import java.util.Scanner;
class Harshad{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    long org = num;
    long sum = 0;
    long rem = 0;
    while(num != 0){
      rem = num%10;
      sum = sum+rem;
      num = num/10;
    }
    if(org%sum==0){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}