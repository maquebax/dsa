package dsa.slidingwindow;

import dsa.ISolution;

/**
 * ----------------------------------------
 * 1456 Max Vowels in SubString
 * ----------------------------------------
 * Given a string s and an integer k, return the maximum number of vowel letters
 * in any substring of s with length k.
 * 
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * 
 * Example 2:
 * 
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * 
 * Example 3:
 * 
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * 1 <= k <= s.length
 */
public class MaxVowelsInSubstring implements ISolution {

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    @Override
    public void execute(Object... args) {
        String s = (String) args[0];
        int k = (int) args[1];
        System.out.println("Given the string : " + s);
        System.out.println("and substring length : " + k);
        System.out.println("max vowels in a subtstring is ... : " + maxVowels(s, k));
        ;

    }

    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        char[] input = s.toCharArray();
        int maxVowels = 0, count = 0;
        for (int i = 0; i < k && i < s.length(); i++) {
            if (vowels.contains("" + s.charAt(i))) {
                count++;
            }
        }
        maxVowels = count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains("" + s.charAt(i))) {
                count++;
            }
            if (vowels.contains("" + s.charAt(i - k))) {
                count--;
            }
            maxVowels = count > maxVowels ? count : maxVowels;
        }

        return maxVowels;
    }

}
