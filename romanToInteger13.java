class Solution {

    public int romanToInt(String s) {

        char[] arr = s.toCharArray();
        int add = 0;

        for (int i = 0; i < arr.length; i++) {

            int value = 0;

            if (arr[i] == 'I')
                value = 1;
            else if (arr[i] == 'V')
                value = 5;
            else if (arr[i] == 'X')
                value = 10;
            else if (arr[i] == 'L')
                value = 50;
            else if (arr[i] == 'C')
                value = 100;
            else if (arr[i] == 'D')
                value = 500;
            else if (arr[i] == 'M')
                value = 1000;

            if (i + 1 < arr.length) {

                int next = 0;

                if (arr[i + 1] == 'I')
                    next = 1;
                else if (arr[i + 1] == 'V')
                    next = 5;
                else if (arr[i + 1] == 'X')
                    next = 10;
                else if (arr[i + 1] == 'L')
                    next = 50;
                else if (arr[i + 1] == 'C')
                    next = 100;
                else if (arr[i + 1] == 'D')
                    next = 500;
                else if (arr[i + 1] == 'M')
                    next = 1000;

                if (value < next)
                    add -= value;
                else
                    add += value;

            } else {
                add += value;
            }
        }

        return add;
    }
}