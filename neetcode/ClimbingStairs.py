class Solution:
    
    def __init__(self):
      
        self.dp = [None for i in range(45)]

    def climbStairs(self, n: int) -> int:

        if n <= 3:
            return n 
        
        if self.dp[n - 1]:
            return self.dp[n - 1]
        
        else:
            self.dp[n - 1] = self.climbStairs(n - 1) + self.climbStairs(n - 2)

        return self.dp[n - 1] 
        
        
            
