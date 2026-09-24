class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        String str1 = s.substring(0, mid);
        String str2 = s.substring(mid);
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str1.length(); i++) {
        char ch = str1.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
            count1++;
        }
    }

    for (int i = 0; i < str2.length(); i++) {
    char ch = str2.charAt(i);

    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
        count2++;
    }
}

return count1==count2;
}
}