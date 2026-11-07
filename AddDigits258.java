
class Solution {
    public int addDigits(int num) {
        int iDigit = 0;
        int iSum = 0;

        while (num > 0) {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }

        while (iSum > 9) {
            int temp = iSum;
            iSum = 0;

            while (temp > 0) {
                iDigit = temp % 10;
                iSum = iSum + iDigit;
                temp = temp / 10;
            }
        }

        return iSum;
    }
}