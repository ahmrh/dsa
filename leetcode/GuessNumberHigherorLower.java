package leetcode;

public class GuessNumberHigherorLower {

  public int guessNumber(int n) {
    return guessNumberRecursive(0, n);
  }

  private int guessNumberRecursive(int low, int high) {
      int mid = low + (high - low) / 2;

      int result = guess(mid);

      if (result == 0) {
          return mid; 
      } else if (result == -1) {
          return guessNumberRecursive(low, mid - 1); 
      } else {
          return guessNumberRecursive(mid + 1, high); 
      }
  }
  
  int guess(int num){
    int pick = 50;

    if(pick < num) return -1;
    if(pick > num) return 1;
    
    return 0;
  }

  public static void main(String[] args) {
    GuessNumberHigherorLower test = new GuessNumberHigherorLower();

    System.out.println(test.guessNumber(1000));
  }
}
