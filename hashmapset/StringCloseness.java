package dsa.hashmapset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import dsa.ISolution;

/**
 * 1657. Determine if Two Strings Are Close
 * 
 * Two strings are considered close if you can attain one from the other using
 * the following operations:
 * 
 * Operation 1: Swap any two existing characters.
 * For example, abcde -> aecdb
 * Operation 2: Transform every occurrence of one existing character into
 * another existing character, and do the same with the other character.
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into
 * a's)
 * 
 * You can use the operations on either string as many times as necessary.
 * 
 * Given two strings, word1 and word2, return true if word1 and word2 are close,
 * and false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: word1 = "abc", word2 = "bca"
 * Output: true
 * Explanation: You can attain word2 from word1 in 2 operations.
 * Apply Operation 1: "abc" -> "acb"
 * Apply Operation 1: "acb" -> "bca"
 * 
 * Example 2:
 * 
 * Input: word1 = "a", word2 = "aa"
 * Output: false
 * Explanation: It is impossible to attain word2 from word1, or vice versa, in
 * any number of operations.
 * 
 * Example 3:
 * 
 * Input: word1 = "cabbba", word2 = "abbccc"
 * Output: true
 * Explanation: You can attain word2 from word1 in 3 operations.
 * Apply Operation 1: "cabbba" -> "caabbb"
 * Apply Operation 2: "caabbb" -> "baaccc"
 * Apply Operation 2: "baaccc" -> "abbccc"
 * 
 */
public class StringCloseness implements ISolution {

    @Override
    public void execute(Object... args) {
        String st1 = (String) args[0];
        String st2 = (String) args[1];

        System.out.println(String.format("1658 : Given String 1 {%s}, String 2 {%s}", st1, st2));
        System.out.println("1657: The given strings are close : " + areTheStringsClose(st1, st2));

    }

    private boolean areTheStringsClose(String st1, String st2) {
        if (st1.length() != st2.length())
            return false;

        Set<Character> st1Set = st1.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        Set<Character> st2Set = st2.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());

        if (!st1Set.equals(st2Set))
            return false;

        int[] st1Freq = new int[26];
        int[] st2Freq = new int[26];

        for (char c : st1.toCharArray()) {
            st1Freq[c - 'a']++;
        }

        for (char c : st2.toCharArray()) {
            st2Freq[c - 'a']++;
        }

        Arrays.sort(st1Freq);
        Arrays.sort(st2Freq);

        return Arrays.equals(st1Freq, st2Freq);

    }

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
