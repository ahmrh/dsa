class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0

        for i in range(len(prices)):
            prices0 = prices[i]
            for j in range(i + 1, len(prices)):
                prices1 = prices[j]
                profit = prices1 - prices0

                if maxProfit < profit:
                    maxProfit = profit
        
        return maxProfit

                
