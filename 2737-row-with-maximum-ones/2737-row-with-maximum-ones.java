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
