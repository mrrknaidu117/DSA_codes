import java.util.*;
class Printtest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        System.out.print(Arrays.toString(arr));

for (int num : arr) {
    System.out.println("["+num+"]");
}
    }
}
