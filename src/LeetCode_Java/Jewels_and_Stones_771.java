package LeetCode_Java;

import java.util.HashMap;
import java.util.Map;

public class Jewels_and_Stones_771 {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<S.length(); i++)
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        int count=0;
        for (int i=0; i<J.length(); i++)
            count+=map.getOrDefault(J.charAt(i), 0);
        return count;
    }
}
