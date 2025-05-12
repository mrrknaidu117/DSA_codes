import java.util.*;
class EquilibriumOfArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        int leftsum = 0;
        for(int j =0;j<size;j++){
            leftsum = leftsum+arr[j];
            if(leftsum == sum){
                System.out.print(j);
            }
            sum = sum-arr[j];
        }
    }
}