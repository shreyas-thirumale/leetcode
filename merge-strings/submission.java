class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while (pos < word1.length() || pos < word2.length()) {
            if (pos < word1.length())
                sb.append(word1.charAt(pos));
            if (pos < word2.length())
                sb.append(word2.charAt(pos));
            pos++;
        }
        return sb.toString();
    }
}