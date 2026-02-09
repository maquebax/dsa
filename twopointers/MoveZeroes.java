package dsa.twopointers;

import java.util.Arrays;

import dsa.ISolution;

/**
 * 
 * 283. MOVE ZEROES
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 * 
 */
public class MoveZeroes implements ISolution {

    public void execute(Object arg) {
        int[] nums = (int[]) arg;
        System.out.println("283. Original int array : " + Arrays.toString(nums));
        moveZeroes2(nums);
        System.out.println("283. Zeroes Shifted array : " + Arrays.toString(nums));
    }


    public void moveZeroes2(int[] nums) {
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }            
        }        
    }      


    public void moveZeroes(int[] nums) {
      
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j]!=0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                    break;    
                }
            }
        }


      
    }
}
