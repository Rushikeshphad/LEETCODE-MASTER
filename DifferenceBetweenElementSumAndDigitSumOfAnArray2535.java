class Solution {
    public int differenceOfSum(int[] nums) {
        int EleSum=0;
        int DigitSum=0;
        for(int i=0; i<nums.length;i++)
        {
            EleSum=EleSum+nums[i];
            int digit=nums[i];
          
            while(digit>0)
            {
                  int temp=digit%10;
                  DigitSum=DigitSum+temp;
                   digit=digit/10;
            }
        }
        return EleSum-DigitSum;
    }
}