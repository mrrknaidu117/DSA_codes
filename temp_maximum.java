import java.util.*;

class temp_maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = {5, 5, 2, 16, 16, 2, 14, 16, 2, 9};
        int n = arr.length;
        int[] result = new int[n];

        for (int j = 0; j < n; j++) {
            int max = arr[j];
            for (int i = j; i < j + size && i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            result[j] = max;
        }

        System.out.println(Arrays.toString(result));
    }
}
