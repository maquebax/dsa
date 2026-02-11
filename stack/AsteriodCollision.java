package dsa.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

import dsa.ISolution;

/**
 * 735. Asteriod Collision
 * 
 * We are given an array asteroids of integers representing asteroids in a row.
 * The indices of the asteroid in the array represent their relative position in
 * space.
 * 
 * For each asteroid, the absolute value represents its size, and the sign
 * represents its direction (positive meaning right, negative meaning left).
 * Each asteroid moves at the same speed.
 * 
 * Find out the state of the asteroids after all collisions. If two asteroids
 * meet, the smaller one will explode. If both are the same size, both will
 * explode. Two asteroids moving in the same direction will never meet.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never
 * collide.
 * Example 2:
 * 
 * Input: asteroids = [8,-8]
 * Output: []
 * Explanation: The 8 and -8 collide exploding each other.
 * Example 3:
 * 
 * Input: asteroids = [10,2,-5]
 * Output: [10]
 * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide
 * resulting in 10.
 * Example 4:
 * 
 * Input: asteroids = [3,5,-6,2,-1,4]​​​​​​​
 * Output: [-6,2,4]
 * Explanation: The asteroid -6 makes the asteroid 3 and 5 explode, and then
 * continues going left. On the other side, the asteroid 2 makes the asteroid -1
 * explode and then continues going right, without reaching asteroid 4.
 */
public class AsteriodCollision implements ISolution {

    @Override
    public void execute(Object arg) {
        int[] arr = (int[]) arg;
        System.out.println("735. Given array" + Arrays.toString(arr));
        System.out.println("735. Output : " + Arrays.toString(findAsteriodCollision(arr)));

    }

    private int[] findAsteriodCollision(int[] arr) {

        int i = 0;
        Stack<Integer> collision = new Stack<>();
        while (i < arr.length) {
   

            while (!collision.isEmpty() && arr[i] < 0 && collision.peek() > 0
                    && Math.abs(collision.peek()) < Math.abs(arr[i])) {
                collision.pop();
            }

            // if(collision.isEmpty())
            if (!collision.isEmpty() && (collision.peek() + arr[i] == 0) && arr[i] < 0) {
                collision.pop();
                i++;
                continue;
            }
            if (collision.isEmpty() || arr[i] > 0 || collision.peek() < 0 && arr[i] < 0)
                collision.push(arr[i]);

            i++;

        }
        return collision.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int a : asteroids){
            while(!stack.isEmpty() && a < 0 && stack.peek() > 0){
                int diff = a + stack.peek();
                if(diff < 0) stack.pop();
                else if(diff > 0) a = 0;
                else{
                   a = 0;
                   stack.pop();
                }
            }
            if(a != 0) stack.push(a);
        }

        int[] result = new int[stack.size()];
        int i = 0;
        for(int val : stack){
            result[i++] = val;
        }
        return result;
    }

}
