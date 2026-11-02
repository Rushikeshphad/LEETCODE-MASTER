class Solution {
    public int countDigits(int num) {
        int temp=num;
        int divide=0;
        int count=0;
        while(num!=0){
            divide=num%10;
            if(temp%divide==0){
                count++;
            }
           num= num/10;
        }
        return count;
    }
}