package leetcode;

public class MoveZeroes {
  
  public void moveZeroes(int[] nums) {
    int size = nums.length;

    int i = 0, j = 0;

    while(i < size && j < size){
      if(nums[j] != 0){
        // Swap
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;

        i ++;
      }

      j++;

    }
  }

}
