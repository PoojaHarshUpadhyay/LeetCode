class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length <= 0) {
            return null;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] dig = new int[digits.length + 1];
        dig[0] = 1;
        return dig;
    }
}
