class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        StringBuilder prefix = new StringBuilder();
        prefix.append(strs[0])
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(first)!=0) {
                first = first.substring(0, first.length()-1);
            }
        }
        return first;
    }
}