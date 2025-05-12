import java.util.*;
public class RightRotation{
     public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k =9999999;
        k=k%n;
        for(int rot =1;rot<=k;rot++){
            int temp =arr[0];
            for (int i=0;i<n-1;i++){
                arr[i] = arr[i+1];     
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
     }
}