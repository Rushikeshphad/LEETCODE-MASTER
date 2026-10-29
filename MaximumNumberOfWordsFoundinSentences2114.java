class Solution {
    public int mostWordsFound(String[] sentences) {
        int iCount=0;
        int iMaxCount=0;
       for(int i=0;i<sentences.length;i++)
       {
        String str=sentences[i];
        iCount = str.split(" ").length;
        if(iCount>iMaxCount)
        {
            iMaxCount=iCount;
        }
       }
       return iMaxCount; 
    }
}