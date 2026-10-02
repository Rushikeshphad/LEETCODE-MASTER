class Solution {
    public String toLowerCase(String s) {
     char[] value = s.toCharArray();
        char[] res = new char[value.length];

        for (int i = 0; i <value.length; i++) {

            if (value[i] >= 'A' && value[i] <= 'Z') {
                res[i] = (char)(value[i] + 32);
            } 
            else {
                res[i] =value[i];
            }
        }

        return new String(res);
    }
}