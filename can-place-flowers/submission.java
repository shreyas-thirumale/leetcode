class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            count++;
            flowerbed[0] = 1;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed.length == 1)
                        return count >= n;
                    else {
                        if (flowerbed[i + 1] == 0) {
                            count++;
                            flowerbed[i] = 1;
                        }
                        if (count >= n)
                            return true;
                    }

                } else if (i == flowerbed.length - 1) {
                    if (flowerbed.length == 1)
                        return count >= n;
                    else {
                        if (flowerbed[i - 1] == 0) {
                            flowerbed[i] = 1;
                            count++;
                        }
                        if (count >= n)
                            return true;
                    }

                } else {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                        if (count >= n)
                            return true;
                    }
                }
            }
        }
        return count >= n;
    }
}