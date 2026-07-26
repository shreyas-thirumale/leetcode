import java.math.BigInteger;

class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int gcd = BigInteger.valueOf(str2.length())
                .gcd(BigInteger.valueOf(str1.length()))
                .intValue();
        String cmp = str1.substring(0, gcd);
        StringBuilder sb = new StringBuilder();
        sb.append(cmp);
        while (sb.length() < str1.length()) {
            sb.append(cmp);
        }
        if (!sb.toString().equals(str1)) {
            return "";
        }
        StringBuilder sb1 = new StringBuilder();
        sb1.append(cmp);
        while (sb1.length() < str2.length()) {
            sb1.append(cmp);
        }
        if (!sb1.toString().equals(str2)) {
            return "";
        }
        return cmp;
    }
}