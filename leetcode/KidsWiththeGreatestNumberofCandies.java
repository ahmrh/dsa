package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
  
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max = 0;
      for(int candy: candies){
        if(max < candy) max = candy;
      }

      List<Boolean> result = new ArrayList<Boolean>();
      for(int candy: candies){
        int total = candy + extraCandies;

        if(total >= max) 
          result.add(true);
        else 
          result.add(false);
      }

      return result;
    }
}
