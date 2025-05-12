class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int MaxCandies = 0;
        List<Boolean> result = new ArrayList<>();

        for(int candy : candies){
            MaxCandies = Math.max(MaxCandies,candy);
        }
        for(int candy : candies){
            result.add(candy + extraCandies >= MaxCandies);
        }
        return result;
    }
}