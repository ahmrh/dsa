package codewars;

public class Bob {
  
  public static int enough(int cap, int on, int wait){
    // your code here
      int passenger = on + wait;
      if(cap >= passenger) return 0;
      else return passenger - cap;
    }
}
