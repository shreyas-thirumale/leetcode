class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int pos = s.length() - 1;
        while (pos >= 0 && s.substring(pos, pos + 1).equals(" ")) {
            pos--;
        }
        while (pos >= 0 && !(s.substring(pos, pos + 1).equals(" "))) {
            length++;
            pos--;
        }
        return length;
    }
}