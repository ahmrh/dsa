package leetcode;

import java.util.Stack;

public class AsteroidCollision {
  public static void main(String[] args) {
    AsteroidCollision ac = new AsteroidCollision();
    int[] asteroids = new int[] {5, 10, -5};
    ac.asteroidCollision(asteroids);
  }

  Stack<Integer> stack = new Stack<Integer>();

  public int[] asteroidCollision(int[] asteroids) {
    for (int asteroid : asteroids) {
      if (stack.isEmpty()) {
        stack.push(asteroid);
        continue;
      }

      if(!isColliding(stack.peek(), asteroid)){
        stack.push(asteroid);
        continue;
      }

      while(isColliding(stack.peek(), asteroid)){
        int asteroid1 = stack.pop();
        if(Math.abs(asteroid1) == Math.abs(asteroid)) continue;
        stack.push(Math.abs(asteroid1) > Math.abs(asteroid) ? asteroid1 : asteroid);
      }
    }

    for (int element : stack) {
      System.out.print(element + " ");
    }
    System.out.println();

    return new int[0];
  }

  boolean isColliding(int a, int b) {
    return a > 0 && b < 0;
  }
}
