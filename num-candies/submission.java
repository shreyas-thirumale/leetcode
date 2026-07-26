class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int num : candies) {
            max = Math.max(num, max);
        }
        for (int i = 0; i < candies.length; i++) {
            int curr = candies[i] + extraCandies;
            list.add(curr >= max);
        }
        return list;
    }
}