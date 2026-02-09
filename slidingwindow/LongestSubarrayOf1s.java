package dsa.slidingwindow;

import java.util.Arrays;

import dsa.ISolution;

/**
 * 1493. Longest Subarray of 1's After Deleting One Element
 * Given a binary array nums, you should delete one element from it.
 * 
 * Return the size of the longest non-empty subarray containing only 1's in the
 * resulting array. Return 0 if there is no such subarray.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = {1,1,0,1}
 * Output: 3
 * Explanation: After deleting the number in position 2, [1,1,1] contains 3
 * numbers with value of 1's.
 * 
 * Example 2:
 * 
 * Input: nums = {0,1,1,1,0,1,1,0,1}
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1]
 * longest subarray with value of 1's is [1,1,1,1,1].
 * 
 * Example 3:
 * 
 * Input: nums = {1,1,1}
 * Output: 2
 * Explanation: You must delete one element.
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * 
 * 
 */
public class LongestSubarrayOf1s implements ISolution {

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        int[] nums = (int[]) args;
        int k = 1;
        System.out.println("1049. Given array" + Arrays.toString(nums));
        System.out.println("Size of Longest Subarray of 1s after a element is :" + longestSubarrayOf1s(nums, k));
    }

    private int longestSubarrayOf1s(int[] nums, int k) {
        int maxLen = 0, l = 0, r = 0, zeroCount = 0;
        while (r < nums.length) {

          if(nums[r]==0){
            zeroCount++;
          }
          while(zeroCount>k){
            if(nums[l]==0){zeroCount--;}
            l++;
          }
          maxLen = Math.max(maxLen,r-l);
            r++;
        }
        return maxLen;
    }

}
