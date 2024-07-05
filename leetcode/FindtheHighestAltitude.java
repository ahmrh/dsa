package leetcode;

public class FindtheHighestAltitude {
  
  public int largestAltitude(int[] gain) {

    int currentAltitude = 0, largestAltitude = 0;
    
    for(int altitude: gain){
      currentAltitude += altitude;

      if(largestAltitude < currentAltitude)
        largestAltitude = currentAltitude;
    }

    return largestAltitude;
        
  }
}
