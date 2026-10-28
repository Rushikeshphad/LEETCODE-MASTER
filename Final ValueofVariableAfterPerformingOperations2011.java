class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int iValue=0;
      for(int i=0;i<operations.length;i++)
      {
        String a=operations[i];
        int j=1;
        if(a.charAt(j)=='+')
            iValue++;
        else
            iValue--;
    }
    return iValue;
}
}cls