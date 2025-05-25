class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = (N*(N+1))/2;
        int sumNums = 0;
        for(int i=0;i<N;i++){
            sumNums +=nums[i];
        }
        return sum-sumNums;
    }
}