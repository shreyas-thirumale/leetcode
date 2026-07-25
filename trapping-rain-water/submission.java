class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                total += leftMax - height[left];
                left++;
            } else {
                total += rightMax - height[right];
                right--;
            }
        }
        return total;
    }
}