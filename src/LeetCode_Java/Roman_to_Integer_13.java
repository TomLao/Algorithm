package LeetCode_Java;

import java.util.HashMap;

public class Roman_to_Integer_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        boolean needSubtract = false;
        int sum = 0, i = 0;
        while (i < s.length()) {
            if (i == s.length() - 1)
                return sum += map.get(s.charAt(i));
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
                i++;
            } else {
                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i += 2;
            }
        }
        return sum;
    }

    /*
    这个用了map这么看起来都不好啊，得想办法改进。
     */
}
