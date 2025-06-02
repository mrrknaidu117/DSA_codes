class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, q = 0;

        for (int num : nums) {
            if (num > 0) {
                pos[p++] = num;
            } else {
                neg[q++] = num;
            }
        }

        int[] result = new int[n];
        int posIndex = 0, negIndex = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = pos[posIndex++];
            } else {
                result[i] = neg[negIndex++];
            }
        }

        return result;
    }
}
