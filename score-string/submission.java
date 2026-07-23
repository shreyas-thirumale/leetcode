class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int curr = 0;
        int next = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            curr = (int) s.charAt(i);
            next = (int) s.charAt(i + 1);
            score += Math.abs(curr - next);
        }
        return score;
    }
}