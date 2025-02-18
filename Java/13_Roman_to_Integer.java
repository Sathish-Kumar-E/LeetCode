class Solution {
    private int[] value = new int[256];
    private int number = 0;
    public int romanToInt(String s) {
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;
        char[] symbols = s.toCharArray();
        for(int i = 0 ; i < symbols.length - 1 ; i++) {
            if(value[symbols[i]] < value[symbols[i+1]]) {
                number -= value[symbols[i]];
            } else {
                number += value[symbols[i]];
            }
        }
        number += value[symbols[symbols.length-1]];
        return number;
    }
}
