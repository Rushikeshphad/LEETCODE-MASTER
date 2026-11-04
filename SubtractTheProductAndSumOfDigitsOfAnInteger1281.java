class Solution {
    public int subtractProductAndSum(int n) {
        int iSum=0;
        int iProduct=1;
        int iDigit=0;
        while(n>0)
        {
             iDigit=n%10;
            iSum+=iDigit;
            iProduct=iProduct*iDigit;
             n=n/10;
        }
        return iProduct-iSum;
    }
}