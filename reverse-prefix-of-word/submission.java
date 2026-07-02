class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> empt = new Stack<>();
        int pos = 0;
        boolean contains = false;
        for (int i = 0;i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                empt.push(word.charAt(i));
                contains = true;
                pos++;
                break;
            } else {
                empt.push(word.charAt(i));
                pos++;
            }
        }
        if (contains == false) return word;
        StringBuilder ret = new StringBuilder();
        while (!empt.isEmpty()) {
            ret.append(empt.pop());
        }
        ret.append(word.substring(pos));
        return ret.toString();
    }
}