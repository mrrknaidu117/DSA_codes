import java.util.*;
class maximum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = {5,5,2,16,16,2,14,16,2,9};
        int n = arr.length;
        for(int j=0;j<=n-size;j++){
            int max = arr[j];
            for(int i=j;i<j+size;i++){
                if(arr[i]>max){
                max = arr[i];
            }
        }
            arr[j]=max;
        
    }
    if(arr[n-2]>arr[n-1]){
        arr[n-2]=arr[n-2];
    }
    else{
        arr[n-2]=arr[n-1];
    }
    System.out.print(Arrays.toString(arr));
}
}