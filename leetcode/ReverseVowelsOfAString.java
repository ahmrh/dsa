package leetcode;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder();

        int size = s.length(), i = 0, j = size - 1;

        while(i < size){
            char c = s.charAt(i);

            if(isVowel(c)){
                while(j >= 0 && !isVowel(s.charAt(j))){
                    j --;
                }
                sb.append(s.charAt(j));
                j --;
            } else {
                sb.append(c);
            }

            i ++;
        }

        return sb.toString();
    }

    Boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
