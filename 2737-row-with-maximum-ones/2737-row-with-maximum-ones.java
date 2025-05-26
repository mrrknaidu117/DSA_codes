class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int[] result = new int[2];
        int onefinal = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int onecount = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    onecount++;
                }
            }
            if (onecount > onefinal) {
                onefinal = onecount;
                index = i;
            }
        }

        result[0] = index;
        result[1] = onefinal;
        return result;
    }
}
/*class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRow = -1;
        int m = mat.length;
        int n = mat[0].length;
        int j = n - 1;

        for (int i = 0; i < m; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j--;
                maxRow = i;
            }
        }

        int ones = (maxRow == -1) ? 0 : (n - 1 - j);
        return new int[]{maxRow == -1 ? 0 : maxRow, ones};
    }
}
*/
