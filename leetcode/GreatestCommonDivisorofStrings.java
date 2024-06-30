package leetcode;

public class GreatestCommonDivisorofStrings {
  public String gcdOfStrings(String str1, String str2) {

    if(!(str1 + str2).equals(str2 + str1)) return "";

    int length1 = str1.length(), length2 = str2.length();

    int gcd = length1;

    if(length1 > length2)
      gcd = gcd(length1, length2);
    else 
      gcd = gcd(length2, length1);

    return str1.substring(0, gcd);
  }

  int gcd(int a, int b){

    if(b == 0) return a;

    return gcd(b, a % b);
  }


}
