
class Solution {
    public String convertToTitle(int columnnumber) {
        StringBuilder result = new StringBuilder();

        while (columnnumber > 0) {
            columnnumber--;

            int rem = columnnumber % 26;

            char ch = (char) ('A' + rem);

            result.append(ch);

            columnnumber = columnnumber / 26;
        }

        return result.reverse().toString();
    }
}
