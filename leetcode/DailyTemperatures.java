package leetcode;

import java.util.Stack;

public class DailyTemperatures {
  
  // public int[] dailyTemperatures(int[] temperatures) {
    
  //   int[] answer = new int[temperatures.length];

  //   for(int i = 0; i < temperatures.length - 1; i++){
  //       int j = i + 1;
  //       if(temperatures[j] > temperatures[i]){
  //           answer[i] += 1;
  //       } 
  //       else {
  //           answer[i] += 1;
  //           while(j < temperatures.length && temperatures[j] < temperatures[i]){
  //             answer[i] += 1;
  //             j += 1;
  //           }
  //           if(j == temperatures.length){
  //             answer[i] = 0;
  //           }
  //       }
  //   }

  //   return answer;
       
  // }
  

  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();
    int size = temperatures.length;

    int[] answer = new int[size];
    for(int i = 0; i < size; i++){
      while(!stack.isEmpty() && stack.peek() > temperatures[i]){
        answer[stack.peek()] = i - stack.pop();
      }

      stack.push(i);
    }

    return answer;
       
  }

}
