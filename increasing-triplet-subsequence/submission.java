class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            if (c <= a) {
                a = c;
            } else if (c <= b) {
                b = c;
            } else if (c > b) {
                return true;
            }
        }
        return false;
    }
}