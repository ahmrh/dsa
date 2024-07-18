package leetcode;

import java.util.HashMap;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char key = magazine.charAt(i);

            if (magazineMap.containsKey(key)) {
                int value = magazineMap.get(key);

                magazineMap.put(key, value + 1);
            } else {
                magazineMap.put(key, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char key = ransomNote.charAt(i);

            if (magazineMap.containsKey(key)) {
                int value = magazineMap.get(key);

                if (value - 1 < 0) return false;

                magazineMap.put(key, value - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
