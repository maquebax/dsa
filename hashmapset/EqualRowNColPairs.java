package dsa.hashmapset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dsa.ISolution;
/**
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

 

Example 1:

Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]

Example 2:

Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]

 
 */
public class EqualRowNColPairs implements ISolution {

    @Override
    public void execute(Object... args) {
        int[][] grid = (int [][]) args[0];
        System.out.println("2001. Given Grid : "+grid);
        System.out.println("2001. Equal Row and Column Pairs : "+equalPairs(grid));
    }

    private int equalPairs(int[][] grid) {
int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                boolean isEqual = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    count++;
                }
            }
        }
        return count;
    }

     public int equalPairs2(int[][] grid) {
        //first naive solution is to put each row and column into a hashmap and then
        //increment return by 1 if it already occured
        //can just use a hashset and if it returns false, it exists already
        int size = grid[0].length;
        int ret = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();
        
        for(int i = 0; i < size; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < size; j++){
                list.add(grid[i][j]);
            }
            map.put(list, map.getOrDefault(list, 0) + 1);
        }
        for(int j = 0; j < size; j++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                list.add(grid[i][j]);
            }
            ret += map.getOrDefault(list, 0);
        }
        return ret;
    }

    @Override
    public void execute(Object args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
    
}
