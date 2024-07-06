package leetcode;

import java.util.Queue;
import java.util.LinkedList;

public class RecentCounter {

  Queue<Integer> recentCounterQueue;

  public RecentCounter() {
    recentCounterQueue = new LinkedList<>();
  }
  
  public int ping(int t) {
    recentCounterQueue.add(t);

    while(t - recentCounterQueue.peek() > 3000){
      recentCounterQueue.poll();
    }

    return recentCounterQueue.size();
  }
}
