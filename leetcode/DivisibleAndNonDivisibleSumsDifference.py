class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        divisibleSum = 0
        nonDivisibleSum = 0

        for num in range(1, n + 1):
            if num % m == 0:
                divisibleSum += num 
            else:
                nonDivisibleSum += num
        
        return nonDivisibleSum - divisibleSum