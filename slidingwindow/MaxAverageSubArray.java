package dsa.slidingwindow;

import java.util.Arrays;

import dsa.ISolution;

/*
-------------------------------
643 : Max Averarge Subarray
-------------------------------

You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:

Input: nums = [5], k = 1
Output: 5.00000

 

Constraints:

    n == nums.length
    1 <= k <= n <= 105
    -104 <= nums[i] <= 104

*/
public class MaxAverageSubArray implements ISolution {

    public void execute(Object... arg) {
        int[] nums = (int[]) arg[0];
        int k = (int) arg[1];

        System.out.println("643. Main Array : " + Arrays.toString(nums));

        System.out.println("643. value of k : " + k);

        System.out.println("643. Maximum Average in the subarray is " + findMaxAverage(nums, k));
    }


    /*
    O(n2) solution
    */
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = -Double.MAX_VALUE, sum = 0;
        out: for (int i = 0; i < nums.length; i++) {
            sum =  nums[i];
            for (int j = 1; j < k; j++) {
                if (i + j >= nums.length) {
                    break out;
                }
                sum += nums[j + i];
            }
            maxSum = (maxSum > sum) ? maxSum : sum;
        }
        System.out.println("643. Maximum SUM in the subarray is " + maxSum);

        return maxSum / k;
    }

    /*
      O(n) solution
    */
    public double findMaxAverage2(int[] nums, int k) {
        double sum = 0;

        // Compute initial window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Remove leftmost, add rightmost
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k; // Return the maximum average
    }
    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
