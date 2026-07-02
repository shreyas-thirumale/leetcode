class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int j = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                list.add(i);
            }
        }
        return list;
    }
}