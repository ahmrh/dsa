class Solution:

    board = None 

    def isValidSudoku(self, board: List[List[str]]) -> bool:
        self.board = board
    
        return self.checkHorizontal() and self.checkVertical() and self.checkSubBoard()

    def checkHorizontal(self) -> bool:
        for j in range(9):
            check_list = [ None for _ in range(9) ]
            for i in range(9):
                num = self.board[i][j]
                if num == '.': continue
                num = int(num)
                
                if check_list[num - 1] != None:
                    return False 
                else:
                    check_list[num - 1] = True
        
        return True
                
    
    def checkVertical(self) -> bool:

        for i in range(9):
            check_list = [ None for _ in range(9) ]
            for j in range(9):
                num = self.board[i][j]
                if num == '.': continue

                num = int(num)
                
                if check_list[num - 1] != None:
                    return False 
                else:
                    check_list[num - 1] = True
        
        return True
                
    
    def checkSubBoard(self) -> bool:

        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                check_list = [ None for _ in range(9) ]
                for k in range(i, i + 3):
                    for l in range(j, j + 3):
                        num = self.board[k][l]
                        if num == '.': continue
                        num = int(num)

                        if check_list[num - 1] != None:
                            return False 
                        else:
                            check_list[num - 1] = True

                        
        return True
      
