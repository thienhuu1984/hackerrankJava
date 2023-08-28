package problemSolving.roadRepair;

import java.util.Vector;

public class Solution {

    public static int countVowels(String s) {

        System.out.println(s);

        int count = 0;
        for(int i = 0;i<s.length(); i++)
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) ==  'o' || s.charAt(i) == 'u' )
                count ++;
        return count;
    }

    public static String findSubstring(String s, int k) {
        // Write your code here

        String sub = s.substring(0, k);
        int max = countVowels(sub);
        System.out.println(s.length());

        for(int i = 1; i < s.length() - (k -1); i ++) {
            String sub1 = s.substring(i, i + k );
            int c = countVowels(sub1);
            System.out.println(c);

            if(max < c) {
                sub = sub1;
                max = c;
            }
            Vector

        }

        return sub;

    }

    public static void main(String[] args) {
        String s = "azerdii";
        int k = 5;
        System.out.println(findSubstring(s, k));
    }
}
