package leetcode;

public class MaximumAverageSubarrayI {
  
  public double findMaxAverage(int[] nums, int k) {

    double sum = 0;
    for(int i = 0; i < k; i++){
        sum += nums[i];
    }
    
    double maxAverage = sum / k;

    for(int i = 0; i + k < nums.length ; i++){
        sum -= nums[i];
        sum += nums[i + k];

        double average = sum / k;

        if(maxAverage < average) maxAverage = average;
    }

    return maxAverage;
  }
}
