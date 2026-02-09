package dsa.hashmapset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dsa.ISolution;

/**
 * 2215. Find the Difference of Two Arrays
 * 
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of
 * size 2 where:
 * 
 * answer[0] is a list of all distinct integers in nums1 which are not present
 * in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present
 * in nums1.
 * 
 * Note that the integers in the lists may be returned in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1
 * and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4
 * and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].
 * 
 * Example 2:
 * 
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * Explanation:
 * For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] ==
 * nums1[3], their value is only included once and answer[0] = [3].
 * Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 * 
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums1.length, nums2.length <= 1000
 * -1000 <= nums1[i], nums2[i] <= 1000
 * 
 * 
 * 
 */
public class DifferenceOfTwoArrays implements ISolution {

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not Supported for this problem");
    }

    @Override
    public void execute(Object... args) {
        int[] nums1 = (int[]) args[0];
        int[] nums2 = (int[]) args[1];
        System.out.println(" 2215. Given array 1 : " + Arrays.toString(nums1));
        System.out.println(" 2215. Given array 2 : " + Arrays.toString(nums2));
        List<List<Integer>> diff = findDifference(nums1, nums2);
        System.out.println(" 2215. Difference between 1 and 2: " + diff.get(0).toString());
        System.out.println(" 2215. Difference between 2 and 1: " + diff.get(1).toString());
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> n2MinusN1 = new ArrayList<>();
        List<Integer> n1MinusN2 = new ArrayList<>();

        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        n2MinusN1 =nums2Set.stream().filter(a -> !nums1Set.contains(a)).collect(Collectors.toList());
        n1MinusN2 = nums1Set.stream().filter(a -> !nums2Set.contains(a)).collect(Collectors.toList());
        answer.add(0, n1MinusN2);
        answer.add(1, n2MinusN1);

        return answer;
    }

}
