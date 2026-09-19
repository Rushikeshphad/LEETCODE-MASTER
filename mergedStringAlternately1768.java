class Solution {

    public String mergeAlternately(String word1, String word2) {

        int size = word1.length() + word2.length();

        char[] ch = new char[size];
        int index = 0;
        for (int i = 0; i < word1.length(); i++) {
            ch[index++] = word1.charAt(i);
            if (i < word2.length()) {
                ch[index++] = word2.charAt(i);
            }
        }
        for (int i = word1.length(); i < word2.length(); i++) {
            ch[index++] = word2.charAt(i);
        }

        return new String(ch);
    }
}