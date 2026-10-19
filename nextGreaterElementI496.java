class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            res[i] = -1;

            int j = 0;

            while (j < nums2.length) {

                if (nums1[i] == nums2[j]) {

                    int k = j + 1;

                    while (k < nums2.length) {
                        if (nums2[k] > nums2[j]) {
                            res[i] = nums2[k];
                            break;
                        }
                        k++;
                    }

                    break;
                }

                j++;
            }
        }

        return res;
    }
}