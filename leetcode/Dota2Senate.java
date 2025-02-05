package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
  
  public String predictPartyVictory(String senate) {
    int size = senate.length();

    Queue<Integer> rQueue = new LinkedList<>();
    Queue<Integer> dQueue = new LinkedList<>();

    for(int i = 0; i < size; i++){
      char c = senate.charAt(i);

      if(c == 'R') rQueue.offer(i);
      else dQueue.offer(i);
    }

    while(rQueue.isEmpty() && dQueue.isEmpty()){
      int rIndex = rQueue.poll();
      int dIndex = dQueue.poll();

      if(rIndex < dIndex) rQueue.offer(rIndex + size);
      else dQueue.offer(dIndex + size);
    }

    if(rQueue.isEmpty()) return "Dire";
    else return "Radiant";
  }
}