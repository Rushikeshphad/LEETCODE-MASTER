class Solution {
    public int dominantIndex(int[] nums) {

        int iLargest = -1;
        int iSecondLargest = -1;
        int iIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > iLargest) {
                iSecondLargest = iLargest;
                iLargest = nums[i];
                iIndex = i;
            }
            else if (nums[i] > iSecondLargest) {
                iSecondLargest = nums[i];
            }
        }

        if (iLargest >= 2 * iSecondLargest) {
            return iIndex;
        }

        return -1;
    }
}