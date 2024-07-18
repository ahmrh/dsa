package leetcode;

import java.util.Dictionary;

public class ValidSudoku {

  char[][] sudokuBoard;

  public boolean isValidSudoku(char[][] board) {
    sudokuBoard = board;

    return checkColumns() && checkRows() && checkSubBoxes();
  }

  boolean checkColumns() {
    for (int i = 0; i < 9; i++) {

      int[] checkArray = new int[9];

      for (int j = 0; j < 9; j++) {
        char c = sudokuBoard[i][j];

        if(c == '.') continue;

        int num = Integer.parseInt(String.valueOf(c));

        if (checkArray[num - 1] != 0)return false;
        checkArray[num - 1] = num;

      }

    }

    return true;

  }

  boolean checkRows() {

    for (int i = 0; i < 9; i++) {

      int[] checkArray = new int[9];

      for (int j = 0; j < 9; j++) {
        char c = sudokuBoard[j][i];

        if(c == '.') continue;

        int num = Integer.parseInt(String.valueOf(c));


        if (checkArray[num - 1] != 0)return false;
        checkArray[num - 1] = num;

      }

    }

    return true;
  }

  boolean checkSubBoxes() {

    for (int x = 0; x < 9; x += 3) {
      for (int y = 0; y < 9; y += 3) {

        int[] checkArray = new int[9];

        for (int i = x; i < i + 3; i++) {
          for (int j = y; j < j + 3; j++) {
            char c = sudokuBoard[i][j];

            if(c == '.') continue;

            int num = Integer.parseInt(String.valueOf(c));

            if (checkArray[num - 1] != 0)return false;
            checkArray[num - 1] = num;

          }
        }

      }
    }

    return true;
  }
}
