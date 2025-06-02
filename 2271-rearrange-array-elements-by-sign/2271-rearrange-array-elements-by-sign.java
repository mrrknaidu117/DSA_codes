class Solution {
    public int[] rearrangeArray(int[] a) {
        int n = a.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                pos.add(a[i]);
            }else{
                neg.add(a[i]);
            }
        }
        int posi = 0;
        int negi = 0;
        int[] result = new int[n];

        for(int i=0;i<n;i++){
           if(i%2==0){
            result[i]=pos.get(posi);
            posi++;
           }else{
            result[i] = neg.get(negi);
            negi++;
           }
        }
        return result;
        
    }
}