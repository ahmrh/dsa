package leetcode;

class MergeStringsAlternately {
  public String mergeAlternately(String word1, String word2) {

    int length1 = word1.length(), length2 = word2.length();
    int i1 = 0, i2 = 0;

    StringBuilder sb = new StringBuilder();

    while(i1 < length1 || i2 < length2){
      if(i1 < length1) sb.append(word1.charAt(i1));
      if(i2 < length2) sb.append(word2.charAt(i2));

      i1 += 1;
      i2 += 1;
    }

    return sb.toString();
      
  }
}