import java.util.*;
class LeftRotation{
     public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k =99999%n;
        for(int rot =1;rot<=k;rot++){
            int temp =arr[n-1];
            for (int i=n-1;i>=1;i--){
                arr[i] = arr[i-1];     
            }
            arr[0] = temp;
         System.out.println(Arrays.toString(arr));
        }
     }
}