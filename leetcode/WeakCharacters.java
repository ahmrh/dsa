package leetcode;

// 1996. The Number of Weak Characters in the Game

public class WeakCharacters {
  
  public int numberOfWeakCharacters(int[][] properties) {
    
    int weakCounter = 0;
    for(int i = 0; i < properties.length; i++){
      int[] propertyA = properties[i];

      for(int j = 0; j < properties.length; j++){
        if(i == j) continue;
        int[] propertyB = properties[j];

        if(propertyA[0] < propertyB[0] && propertyA[1] < propertyB[1]){
          weakCounter += 1;
          break;
        }

      }
    }

    return weakCounter;

  }
}
