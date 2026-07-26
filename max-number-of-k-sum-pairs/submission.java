class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(k - num)) {
                if (map.get(k - num) > 1) {
                    map.put(k - num, map.get(k - num) - 1);
                } else {
                    map.remove(k - num);
                }
                count++;
            } else {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }
        return count;
    }
}