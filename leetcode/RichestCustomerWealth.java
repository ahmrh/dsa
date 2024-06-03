package leetcode;

public class RichestCustomerWealth {
  
  public int maximumWealth(int[][] accounts) {

    int highestSum = 0;
    for(int[] account: accounts){
      int sum = 0;
      for(int wealth: account){
        sum += wealth;
      }

      if(highestSum < sum) highestSum = sum;
    }

    return highestSum;
        
  }
}
