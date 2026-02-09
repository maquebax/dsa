package dsa.slidingwindow;

import java.util.Arrays;


import dsa.ISolution;
/**
 * 1004 Max Consecutive Ones III
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

 

Constraints:

    1 <= nums.length <= 105
    nums[i] is either 0 or 1.
    0 <= k <= nums.length


 */
public class MaxConsecutiveOnes implements ISolution{

    @Override
    public void execute(Object... args) {
        // TODO Auto-generated method stub
        int[] nums = (int[]) args[0];
        int k = (int) args[1];
       
        System.out.println("1004. Main Array : " + Arrays.toString(nums));
        System.out.println("1004. Max Consecutive Ones III : " + maxConsecutiveOnes( nums, k));

     
    }

    public int maxConsecutiveOnes(int [] nums, int k) {
        int l = 0 ,r=0, maxLen =0, zeroCount =0;

        while(r<nums.length){
            if(nums[r]==0) zeroCount++;
            while(zeroCount>k){
                if(nums[l]==0) zeroCount--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l +1);
            r++;
        }
        return maxLen;
    }

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
