class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while (i < chars.length) {
            char curr = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                i++;
                count++;
            }
            chars[write] = curr;
            write++;
            if (count > 1) {
                char[] nums = Integer.toString(count).toCharArray();
                for (int a = 0; a < nums.length; a++) {
                    chars[write] = nums[a];
                    write++;
                }
            }
        }
        return write;
    }
}
