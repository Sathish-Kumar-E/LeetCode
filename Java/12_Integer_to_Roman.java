class Solution {
    private String[] symbol = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private int[] value = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    private int i = value.length - 1;
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            if(value[i] > num) {
                i--;
                continue;
            }
            num -= value[i];
            sb.append(symbol[i]);
        }
        return sb.toString();
    }
}
