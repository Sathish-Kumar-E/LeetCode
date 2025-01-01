class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverseNumber(num);
        int rev2 = reverseNumber(rev1);
        return num == rev2;
    }
    public int reverseNumber(int num) {
        int rev = 0;
        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}
