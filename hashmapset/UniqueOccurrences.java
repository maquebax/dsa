package dsa.hashmapset;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dsa.ISolution;
/**
 *  1207. Unique Number of Occurrences
 * 
 *  Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 *  Example 1:
 *  Input: arr = [1,2,2,1,1,3] 
 *  Output: true
 *  Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 * 
 *  Example 2:
 *  Input: arr = [1,2]
 *  Output: false
 *  Explanation: Both 1 and 2 have 1 occurrence.
 *  
 * 
 */
public class UniqueOccurrences implements ISolution {

    @Override
    public void execute(Object args) {
        int[] arr = (int []) args;
        System.out.println("1207. Given Array : "+Arrays.toString(arr));
        System.out.println("1207. Unique occurrences : "+uniqueOccurrences(arr));

        // new UniqueOccurances().execute(arr);
    }
    
     public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer> counterMap = new HashMap<>();
        for(int e : arr){
            int count = counterMap.getOrDefault(e,0);
            counterMap.put(e,++count);
        }
        long uniqueCount =  counterMap.values().stream().distinct().count();
   
        return uniqueCount==counterMap.size();   
    }
}
