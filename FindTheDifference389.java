class Solution {
    public char findTheDifference(String s, String t) {
    int l=s.length();
        char res=0;
        for(int i=0;i<l;i++){
            res^=(s.charAt(i)^t.charAt(i));
        }
        res^=t.charAt(t.length()-1);
        return res;
    }
}