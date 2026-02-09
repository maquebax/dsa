package dsa.twopointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dsa.ISolution;


/**
 * -------------------------------------------------------------
 * 
 * 1679. Max Number Of K-Sum pairs
 * -------------------------------------------------------------
  You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.

 

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

 

Constraints:

    1 <= nums.length <= 105
    1 <= nums[i] <= 109
    1 <= k <= 109

 */
public class MaxNumberOfKSumPairs implements ISolution{

    @Override
    public void execute(Object... args) {
    int[] nums = (int[]) args[0];
    int k = (int) args[1];
    
    System.out.println("1679  : Max K-Sum pairs for the array "+ Arrays.toString(nums));
    System.out.println("and k = "+k);
    System.out.println("is ... "+maxOperations2(nums,k));
    }

    
    public int maxOperations(int[] nums, int k) {
        int count=0;
        for(int i=0; i < nums.length; i++){
            
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==k){
                    count++;
                    nums[i]=-100000000;
                    nums[j]=-100000000;
                    break;
                }
            }
        }
     return count;
    }
    
    public int maxOperations2(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        int m=0;
        while(l<r){
            if(nums[l]+nums[r]==k){
                l++;
                r--;
                m++;
            }else if(nums[l]+nums[r]<k){
                l++;
             }else r--;
        }
        return m;
        
    }

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}