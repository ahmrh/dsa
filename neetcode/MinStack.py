class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        
        

    def pop(self) -> None:
        return self.stack.pop()

    def top(self) -> int:
        return self.stack.peek()
        

    def getMin(self) -> int:
        min = self.stack.peek()

        for num in self.stack:
            if min > num:
                min = num
        
        return min
        
