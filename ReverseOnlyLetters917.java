class Solution {
    public String reverseOnlyLetters(String s) {
       char [] ch= s.toCharArray();
       int left = 0;
        int right = ch.length - 1;
        while(left<right){
           if (!((ch[left] >= 'a' && ch[left] <= 'z') ||
                  (ch[left] >= 'A' && ch[left] <= 'Z'))) {
                left++;
            }
            else if (!((ch[right] >= 'a' && ch[right] <= 'z') ||
                       (ch[right] >= 'A' && ch[right] <= 'Z'))) {
                right--;
            }
            else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }
        return new String(ch);
    }
}