class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m - 1;
        int point2 = n - 1;
        int pos = nums1.length - 1;
        while (point1 >= 0 && point2 >= 0) {
            if (nums1[point1] >= nums2[point2]) {
                nums1[pos] = nums1[point1];
                pos--;
                point1--;
            } else if (nums2[point2] > nums1[point1]) {
                nums1[pos] = nums2[point2];
                pos--;
                point2--;
            }
        }
        while (point1 >= 0) {
            nums1[pos--] = nums1[point1--];
        }
        while (point2 >= 0) {
            nums1[pos--] = nums2[point2--];
        }
    }
}