class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] arr = new StringBuilder[numRows];
        if (numRows == 1) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }
        int curr = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            arr[curr].append(c);

            if (curr == 0 || curr == numRows - 1) {
                down = !down;
            }
            if (down) {
                curr++;
            } else {
                curr--;
            }
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            output.append(arr[i]);
        }
        return output.toString();
    }
}