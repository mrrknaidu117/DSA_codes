import java.util.*;
class Majority{
    public static void main(String args[]){
        int arr[] = {1,1,1,3,2,1,1,2,2,2,2,3,3,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        Arrays.sort(arr);
        //O(N LOG N)
        int max =0;
        int count =1;
        int val =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                max = Math.max(count,max);
                val = arr[i];
            }
            else{
                count =1;
            }
        }
        System.out.print(max +" "+val);
    }
}