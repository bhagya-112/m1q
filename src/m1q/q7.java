package m1q;  //longest substring   //not the needed output 

import java.util.HashSet;
import java.util.Set;

public class q7 {
    public int lengthOfLongestSubstring(String s, Set<Character> set) {
        int n = s.length();
        int i = 0, j = 0, maxLen = 0;
        
        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        q7 source = new q7();
        Set<Character> set = new HashSet<>();
        String input = "abcabcbb";
        int result = source.lengthOfLongestSubstring(input, set);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}