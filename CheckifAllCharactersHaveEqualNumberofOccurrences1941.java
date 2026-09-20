class Solution {
    public boolean areOccurrencesEqual(String s) {
        int firstCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(0)) {
                firstCount++;
            }
        }
      
        for (char c = 'a'; c <= 'z'; c++) {

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }

            if (count != 0 && count != firstCount) {
                return false;
            }
        }

        return true;
    }
}