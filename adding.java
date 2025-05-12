import java.util.*;
class adding{
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7};
        
        for(int i = 0;i<=arr.length-1;i++){
            int sum = 0;
            for(int j = 0;j<arr.length;j++){
               sum = sum+arr[j];
            }
             sum = sum-arr[i];
             System.out.print(sum+" ");
        }
    } 
}