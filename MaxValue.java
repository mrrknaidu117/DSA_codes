import java.util.*;
class MaxValue{
    public static void main(String[] args) {
        int []arr={2,5,1,5,6,8,3,68,34};
        int max= 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}