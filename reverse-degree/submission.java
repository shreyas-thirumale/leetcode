class Solution {
    public int reverseDegree(String s) {
        char[] list = { 'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h',
                'g', 'f', 'e', 'd', 'c', 'b', 'a' };
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < list.length; j++) {
                if (s.charAt(i) == list[j]) {
                    total += (i + 1) * (j + 1);
                }
            }
        }
        return total;
    }

}