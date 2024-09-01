class CanJump{

  public static void main(String[] args) {
    
  }

  public boolean canReach(int[] nums) {
    int size = nums.length;

    boolean[] dp = new boolean[size];

    int i = size - 1;
    while(i >= 0){
        if(dp[i] == false){
            int j = i;
            while(j < size && nums[j] == false){
                j += nums[j];
            } 

            if(j == size - 1) dp[i] = true;
        }

        i --;
    }

    return dp[0];
  }
}