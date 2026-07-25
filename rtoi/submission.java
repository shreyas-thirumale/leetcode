class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("I")) {
                if (i >= s.length() - 1) {
                    total += 1;
                } else if (s.substring(i + 1, i + 2).equals("V")) {
                    total += 4;
                    i++;
                } else if (s.substring(i + 1, i + 2).equals("X")) {
                    total += 9;
                    i++;
                } else {
                    total += 1;
                }
            } else if (s.substring(i, i + 1).equals("V")) {
                total += 5;
            } else if (s.substring(i, i + 1).equals("X")) {
                if (i >= s.length() - 1) {
                    total += 10;
                } else if (s.substring(i + 1, i + 2).equals("L")) {
                    total += 40;
                    i++;
                } else if (s.substring(i + 1, i + 2).equals("C")) {
                    total += 90;
                    i++;
                } else {
                    total += 10;
                }
            } else if (s.substring(i, i + 1).equals("L")) {
                total += 50;
            } else if (s.substring(i, i + 1).equals("C")) {
                if (i >= s.length() - 1) {
                    total += 100;
                } else if (s.substring(i + 1, i + 2).equals("D")) {
                    total += 400;
                    i++;
                } else if (s.substring(i + 1, i + 2).equals("M")) {
                    total += 900;
                    i++;
                } else {
                    total += 100;
                }
            } else if (s.substring(i, i + 1).equals("D")) {
                total += 500;
            } else if (s.substring(i, i + 1).equals("M")) {
                total += 1000;
            }
            System.out.println(total);
        }
        return total;
    }
}