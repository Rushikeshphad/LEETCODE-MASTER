class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack[count] = ch;
                count++;
            }

            else {

                if (count == 0) {
                    return false;
                }

                char top = stack[count - 1];

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                count--;
            }
        }

        return count == 0;
    }
}