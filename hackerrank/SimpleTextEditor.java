package hackerrank;

import java.util.*;

public class SimpleTextEditor {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Stack<String> history = new Stack<>();

    while (sc.hasNextLine()) {
      String op = sc.nextLine();

      switch (op.charAt(0)) {
        case '1': {
          history.push(op.substring(2));
        }
        case '2': {
          int length = Integer.parseInt(String.valueOf(op.charAt(2)));
          String str = history.peek();
          history.push(str.substring(0, str.length() - length));

        }
        case '3': {
          int index = Integer.parseInt(String.valueOf(op.charAt(2)));
          String str = history.peek();
          System.out.println(str.charAt(index + 1));
        }
        case '4': {
          history.pop();
        }
      }

    }
  }
}
