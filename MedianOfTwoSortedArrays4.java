import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] num = new int[nums1.length + nums2.length];

        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            num[index++] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            num[index++] = nums2[i];
        }

        Arrays.sort(num);

        int n = num.length;

        if (n % 2 == 0) {
            int mid = n / 2;
            return (num[mid - 1] + num[mid]) / 2.0;
        } 
        else {
            return num[n / 2];
        }
    }
}