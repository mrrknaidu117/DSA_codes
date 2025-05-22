class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count =0;
        int max_count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max_count = Math.max(count,max_count);
            }else{
                count = 0;
            }
        }
        return max_count;
    }
}