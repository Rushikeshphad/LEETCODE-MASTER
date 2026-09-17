class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            int a = s.charAt(i);
            int b = s.charAt(j);
            if ((a >= 97 && a <= 122) || (a >= 48 && a <= 57)) {
                if ((b >= 97 && b <= 122) || (b >= 48 && b <= 57)) {
                    if (a != b) {
                        return false;
                    }
                    i++;
                    j--;
                }
                else {
                    j--;
                }
            }
            else {
                i++;
            }
        }
        return true;
    }
}