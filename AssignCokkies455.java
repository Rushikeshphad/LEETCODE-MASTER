class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // first i sorted the because of the child behaviour and it rewuire size so we configure that first we sorted this two array 
        Arrays.sort(s);
        int iChild = 0; // i just initialize the child variable to return the valie at the last 
        int iCookie = 0;// it can iterate the second array to identify the cokkie size 
        while (iChild < g.length && iCookie < s.length) {
            if (s[iCookie] >= g[iChild]) {
                iChild++; // here we access each element and find the children statisfied with cookie size
            }
            iCookie++;// here is the business logic of the code 
        }
        return iChild;// here we written the children count which are satisfied with the cokkie size 
    }
}