def hasDuplicate(self, nums: List[int]) -> bool:
  
  dict = { }
  
  for num in nums:
    if num in dict:
      return True
    else:
      dict[num] = 1
  
  return False