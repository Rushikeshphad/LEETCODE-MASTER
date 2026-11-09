class Solution {
    public int differenceOfSum(int[] nums) {
        int ElementSum=0;
        int DigitSum=0;
        for(int i=0; i<nums.length;i++)
        {
            ElementSum=ElementSum+nums[i];
            int digit=nums[i];
          
            while(digit>0)
            {
                  int temp=digit%10;
                  DigitSum=DigitSum+temp;
                   digit=digit/10;
            }
        }
        return ElementSum-DigitSum;
    }
}