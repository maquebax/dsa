package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import dsa.ISolution;

/**
 * 394. Decode String
 * 
 * Given an encoded string, return its decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the
 * square brackets is being repeated exactly k times. Note that k is guaranteed
 * to be a positive integer.
 * 
 * You may assume that the input string is always valid; there are no extra
 * white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any
 * digits and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 * 
 * The test cases are generated so that the length of the output will never
 * exceed 105.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 * 
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 * 
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */
public class DecodeString implements ISolution {

    @Override
    public void execute(Object arg) {
        String input = (String) arg;
        System.out.println("394. Given encoded input string : " + input);
        System.out.println("394. decoded output string : " + decodeString(input));
    }

    // 3[a2[c]]
    public String decodeString(String input) {
        int k = 0, i = 0;
        String decoded = "", encoded = "", kString = "";
        Stack<Integer> numberStack = new Stack<>();
        while (i < input.length()) {

            if (input.charAt(i) <= '9' && input.charAt(i) >= '0') {
                kString = kString + input.charAt(i);
            }
            if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
                    || (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {
                decoded = decoded + input.charAt(i);
            }

            if (input.charAt(i) == '[') {
                k = Integer.valueOf(kString);
                kString = "";
                i++;
                int brackets = 1;
                while (brackets > 0 && i < input.length()) {
                    if (input.charAt(i) == '[')
                        brackets++;
                    else if (input.charAt(i) == ']')
                        brackets--;
                    if (brackets > 0) {
                        encoded = encoded + input.charAt(i);
                        i++;
                    }
                }
                if (encoded.contains("[")) {
                    encoded = decodeString(encoded);
                }

                while (k > 0) {
                    decoded = decoded + encoded;
                    k--;
                }
            }

            encoded = "";

            i++;
        }
        return decoded;
    }

     public String decodeStringUsingStack(String s) {

        Deque<Integer> countStack = new ArrayDeque<>();

        Deque<String> stringStack = new ArrayDeque<>();

        int currentCount =0;
        String currentString = "";


        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){

                currentCount = currentCount * 10 + ( ch - '0');


            }else if(ch == '['){

                countStack.push(currentCount);
                stringStack.push(currentString);
                currentCount = 0;
                currentString = "";

            }else if(ch == ']'){

                int repeatTimes = countStack.pop();

                StringBuilder repeatedString = new StringBuilder();

                for(int i=0 ; i < repeatTimes ; i++){
                    repeatedString.append(currentString);

                }

                currentString = stringStack.pop() + repeatedString.toString();
            }else{
                currentString += ch;
            }
        }
        return currentString;
    }
}
