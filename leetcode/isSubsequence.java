package leetcode;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while(j < t.length()){
            if(i < s.length() && s.charAt(i) == t.charAt(j)){
                i += 1;
            }

            j += 1;
        }

        return i == s.length();

    }
}
