package dsa.twopointers;

import java.util.Arrays;

import dsa.ISolution;

/**
 * 11. Container With Most Water
 * Medium
 * Topics
 * premium lock iconCompanies
 * Hint
 * 
 * You are given an integer array height of length n. There are n vertical lines
 * drawn such that the two endpoints of the ith line are (i, 0) and (i,
 * height[i]).
 * 
 * Find two lines that together with the x-axis form a container, such that the
 * container contains the most water.
 * 
 * Return the maximum amount of water a container can store.
 * 
 * Notice that you may not slant the container.
 * 
 * 
 * 
 * Example 1:
 * https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array
 * [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
 * container can contain is 49.
 * 
 * Example 2:
 * 
 * Input: height = [1,1]
 * Output: 1
 * 
 * 
 * 
 * Constraints:
 * 
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 * 
 * 
 */
public class ContainerWithMostWater implements ISolution {

    public void execute(Object arg) {
        int htArray[] = (int[]) arg;
        System.out.println("11. The input ht array : " + Arrays.toString(htArray));
        System.out.println("11. max volume of water in a container : " + maxArea2(htArray));

    }

    public int maxArea(int[] height) {
        int maxArea = 0, area = 0;
        int ht = 0, ln = 0;
        for (int i = 0; i < height.length - 1; i++) {

            for (int j = i + 1; j < height.length; j++) {
                ht = (height[i] < height[j]) ? height[i] : height[j];
                ln = j - i;
                area = ht * ln;
                maxArea = maxArea > area ? maxArea : area;
            }
        }

        return maxArea;
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        int left =0, right = height.length-1;

        while(left <right){

            int water = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(water,maxArea);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
    }

}
