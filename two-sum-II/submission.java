class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                int[] arr = new int[2];
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
            } else {
                if (numbers[left] + numbers[right] > target) right--;
                else left++;
            }
        }
        return null;
    }
}
