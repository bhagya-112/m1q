package m1q;   // anagrams   //imp//

import java.util.ArrayList; 
import java.util.List;
public class q2 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length())
            return result;
        int[] charCount = new int[26]; 
        for (char c : p.toCharArray()) {
            charCount[c - 'a']++;
        }
        int start = 0, end = 0;
        int counter = p.length();
        while (end < s.length()) {
            if (charCount[s.charAt(end++) - 'a']-- >= 1) {
                counter--;
            }
            if (counter == 0) {
                result.add(start);
            }
            if (end - start == p.length()) {
                if (charCount[s.charAt(start++) - 'a']++ >= 0) {
                    counter++;
                }
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        q2 source = new q2();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = source.findAnagrams(s, p);
        System.out.println(indices); // Output: [0, 6]
    }
}