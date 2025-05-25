class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        HashSet<Integer> result = new HashSet<>();
        for(int num : nums2){
            if(set1.contains(num)){
            result.add(num);
            }
        }
        int[] finalResult = new int [result.size()];
        int i=0;
        for(int num : result){
            finalResult[i] = num;
            i++;
        }
        return finalResult;
    }
}