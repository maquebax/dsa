package dsa.queue;

import java.util.PriorityQueue;
import java.util.Queue;
/**
 * 933. Number of Recent Calls
 * 
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.

 

Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
[[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
 

Constraints:

1 <= t <= 109
Each test case will call ping with strictly increasing values of t.
At most 104 calls will be made to ping.
 */
public class RecentCounter {
    Queue<Integer> _ping;
      private static final int[] records = new int[10000]; //
    private int start;
    private int end;

    public RecentCounter() {
        _ping = new PriorityQueue<>();
        start = 0;
        end = 0;
    }
    
    public int ping(int t) {
        _ping.add(t);
       
        return (int)_ping.stream().filter(e->(t-e)<=3000).count();

    }
  
  
    
    public int ping2(int t) {
        while (start < end && (t - records[start] > 3000)) { 
            start++; // if the difference in time is greater than 3000ms, 
            // than increase the value of start unitl it's equal or less than 3000ms.
        }
        records[end++] = t; // Inserting the current time at the end
        return end - start; // Returning the answer including the element added just now.
    }
}

