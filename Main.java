package dsa;

import dsa.arrays.CompressString;
import dsa.hashmapset.DifferenceOfTwoArrays;
import dsa.hashmapset.EqualRowNColPairs;
import dsa.hashmapset.StringCloseness;
import dsa.hashmapset.UniqueOccurrences;
import dsa.prefixsum.HighestAltitude;
import dsa.prefixsum.PivotIndex;
import dsa.queue.RecentCounter;
import dsa.slidingwindow.LongestSubarrayOf1s;
import dsa.slidingwindow.MaxAverageSubArray;
import dsa.slidingwindow.MaxConsecutiveOnes;
import dsa.slidingwindow.MaxVowelsInSubstring;
import dsa.stack.AsteriodCollision;
import dsa.stack.DecodeString;
import dsa.stack.RemovingStarsFromString;
import dsa.twopointers.ContainerWithMostWater;
import dsa.twopointers.IsSubsequence;
import dsa.twopointers.MaxNumberOfKSumPairs;

import java.util.HashMap;
import java.util.Map;

import dsa.arrays.CompressString;
import dsa.twopointers.MoveZeroes;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        // 11
        // containerWithMostWater();

        // 283
        // moveZeroes();

        // 392
        // isSubsequence();

        // 394
        decodeString();
        // 443
        // //stringCompression();

        // 643
        // maxAverageSubArray();

        // 724
        // findPivotIndex();

        // 735
        // asteriodCollision();

        // 933
        recentCounter();
        // 1004
        // maxConsecutiveOnes();

        // 1207
        // findUniqueOccurances();

        // 1456
        // maxVowelsInSubString();

        // 1493
        // longestSubarrayOf1s();

        // 1657
        // determineStringCloseness();

        // 1679
        // maxNoOfKSumPairs();

        // 1732
        // highestAltitude();

        // 2215
        // differenceOfTwoArrays();

        // 2352.
        // equal row and col pairs
        // equalRowNColPairs();

        // 2390
        // removeStarsFromString();
    }

    

     static void recentCounter() {
        // TODO Auto-generated method stub
        RecentCounter counter = new RecentCounter();
        System.out.println("ping 1 :"+counter.ping(1));
        System.out.println("ping 100 :"+counter.ping(100));
        System.out.println("ping 3001 :"+counter.ping(3001));
        System.out.println("ping 3002 :"+counter.ping(3002));
    }



    /**
     * 11. Container With Most Water
     */

    static void containerWithMostWater() {

        int[] ht1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] ht2 = { 1, 1 };
        int[] ht3 = { 1, 2, 4, 3 };
        new ContainerWithMostWater().execute(ht1);
    }

    /**
     * 283 move zeroes
     */
    static void moveZeroes() {
        int[] nums1 = { 0, 1, 0, 0, 3, 12 };
        int[] nums2 = { 0, 0, 1 };
        // int[] nums3 = {0,1,0};
        int[] nums3 = { 0, 1, 1 };
        new MoveZeroes().execute(nums1, nums2, nums3);

    }

    /**
     * 392 Is Subsequence
     */
    static void isSubsequence() {
        Map<String, String> input = new HashMap<String, String>();
        input.put("subseq", " mainstring");// false
        input.put("aaaaaa", "bbaaaa");// false
        input.put("aaaaaaa", "aaaaaa");// false
        input.put("axc", "ahbgdc"); // false
        input.put("acb", "ahbgdc");// false
        input.put("abc", "ahbgdc");// true
        input.put("leeeeetcode", IsSubsequence.longString); // true

        new IsSubsequence().execute(input);
    }

    /**
     *  394. decode the encoded string
     */
     static void decodeString() {
        String in1 = "3[a]2[bc]", in2= "3[a2[c]]",in3="2[abc]3[cd]ef",in4="3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        Map<String,String> expectedOutMap = new HashMap<>();
        expectedOutMap.put(in4, "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef");
        new DecodeString().execute(in4);
        System.out.println("success :" +new DecodeString().decodeString(in4).equals(expectedOutMap.get(in4)));
    }


    /**
     * 443 string compression
     */
    static void stringCompression() {
        char s1[] = { 'a', 'b', 'b', 'b', 'c', 'c', 'c' };
        char s2[] = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'c' };
        char s3[] = { 'a' };
        ISolution solution = new CompressString();
        solution.execute(s1, s2, s3);
    }

    /**
     * 643 Max Average Subarray
     */
    static void maxAverageSubArray() {
        int nums1[] = { 1, 12, -5, -6, 50, 3 };
        int k1 = 4;

        int nums2[] = { -1 };
        int k2 = 1;
        new MaxAverageSubArray().execute(nums2, k2);
    }

    // 724. find pivot index
    static void findPivotIndex() {
        int[] nums1 = { 1, 7, 3, 6, 5, 6 };
        int[] nums2 = { 1, 2, 3 };
        int[] nums3 = { 2, 1, -1 };
        new PivotIndex().execute(nums1, nums2, nums3);
    }

    /**
     * 735. Asteriod Collision
     */
    static void asteriodCollision() {
        int arr1[] = { 5, 10, -5 };
        int arr2[] = { 10, 2, -3 };
        int arr3[] = { 3, 5, -6, 2, -1, 4 };
        int arr4[] = { 8, -8 };
        int arr5[] = { -2, -2, -1, -2 };
        int arr6[] = { -2, 1, -2, -1 };
        int arr7[] = { -2, 1, 1, -1 };
        int arr8[] = { 7, -1, 2, -3, -6, -6, -6, 4, 10, 2 };
        // new AsteriodCollision().execute(arr1,arr2,arr3,arr4,arr5,arr6,arr7,arr8);
        new AsteriodCollision().execute(arr8);

    }

    /**
     * 1004 Max Consecutive Ones III
     */
    static void maxConsecutiveOnes() {
        int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

        new MaxConsecutiveOnes().execute(nums, 2);
    }

    /**
     * 1207. find unique occurances.
     */
    static void findUniqueOccurances() {
        // TODO Auto-generated method stub
        int arr1[] = { 1, 2, 2, 1, 1, 3 };
        int arr2[] = { 1, 2 };
        new UniqueOccurrences().execute(arr1, arr2);
    }

    /**
     * 1456. Max Vowels in a Substring of size k
     */
    static void maxVowelsInSubString() {
        String s1 = "leetcode";
        int k1 = 3;
        new MaxVowelsInSubstring().execute(s1, k1);

    }

    /**
     * 1493. Longest Subarray of 1's After Deleting One Element
     */
    private static void longestSubarrayOf1s() {
        int nums1[] = { 1, 1, 0, 1 };
        int nums2[] = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int nums3[] = { 1, 1, 1 };
        new LongestSubarrayOf1s().execute(nums1, nums2, nums3);
    }

    /**
     * 1657 String Closeness
     */

    static void determineStringCloseness() {
        String st1 = "a";
        String st2 = "aa";
        new StringCloseness().execute(st1, st2);
    }

    /**
     * 1679 Max K Sum Pairs
     */
    static void maxNoOfKSumPairs() {
        int[] nums1 = { 3, 1, 3, 4, 3 };
        int k1 = 6;

        int[] nums2 = { 4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4 };
        int k2 = 2;
        new MaxNumberOfKSumPairs().execute(nums2, k2);
    }

    /**
     * 1732 Find the highest altitude
     */
    static void highestAltitude() {
        int[] nums1 = { -5, 1, 5, 0, -7 };
        int[] nums2 = { -4, -3, -2, -1, 4, 3, 2 };
        new HighestAltitude().execute(nums1, nums2);
    }

    /**
     * 2215. Difference of 2 arrays
     */
    static void differenceOfTwoArrays() {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };

        int[] nums3 = { 1, 2, 3, 3 };
        int[] nums4 = { 1, 1, 2, 2 };

        new DifferenceOfTwoArrays().execute(nums1, nums2);
        new DifferenceOfTwoArrays().execute(nums3, nums4);
    }

    /**
     * 2352. Equal Row and Col Pairs
     */

    static void equalRowNColPairs() {
        int[][] grid = { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } };
        new EqualRowNColPairs().execute(grid);

    }

    /**
     * 2390. Removing stars from string
     */

    private static void removeStarsFromString() {
        // TODO Auto-generated method stub
        new RemovingStarsFromString().execute("leet**cod*e");
    }
}
