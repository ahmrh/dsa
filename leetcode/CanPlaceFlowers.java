package leetcode;

public class CanPlaceFlowers {
  
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int size = flowerbed.length;

    for(int i = 0; i < size; i++){

      if(flowerbed[i] == 1) continue;

      if((i == 0 || flowerbed[i - 1] == 0) && (i == size - 1 || flowerbed[i + 1] == 0)){
        n --;
        flowerbed[i] = 1;
      }
      
    }

    return n <= 0;
  }
}
