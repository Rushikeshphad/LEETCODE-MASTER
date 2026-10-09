import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) { // here we iterate a loop to store the character in the hashmap 
            char ch = magazine.charAt(i);    // here we access the string character by the charAt method 
            if (map.containsKey(ch)) {  // here we check the if character is present then icrease its count by 1 
                map.put(ch, map.get(ch) + 1); // this is the logic behind it a key of name character and its value is modified by this method 
            } else {
                map.put(ch, 1);   // else here is put the character in the hashmap and make it count as 1
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {  // here we iterate the string 
            char ch = ransomNote.charAt(i);// here  we access the every character of the string using the charAt method to compare with the first string character

            if (!map.containsKey(ch) || map.get(ch) == 0) {  // this logic is written for the if the character is not present in the map where we store the character of the first string  and if the value of hte count is 0 then  return false 
                return false;  // this is the logic for the return false
            }

            map.put(ch, map.get(ch) - 1); // if it is present in the map then make it count or minus count by 1
        }

        return true;  // and at the last while loop are finished return true if all the condition becomes true .
    }
}