class Solution {
    public double[] convertTemperature(double celsius) {
        double kel = celsius + 273.15;
        double fahr = (celsius * 1.80) + 32;
        double[] ret = { kel, fahr };
        return ret;
    }
}