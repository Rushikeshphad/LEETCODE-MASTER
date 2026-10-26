class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        boolean[] isJewels = new boolean[128];
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            isJewels[jewels.charAt(i)] = true;
        }

        for (int i = 0; i < stones.length(); i++) {
            if (isJewels[stones.charAt(i)]) {
                count++;
            }
        }

        return count;
    }
}