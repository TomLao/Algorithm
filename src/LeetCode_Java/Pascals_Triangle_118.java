package LeetCode_Java;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        List<Integer> list;
        for (int i = 0; i < numRows; i++) {
            list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i + 1; j++) {
                if (j != i) {
                    list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                } else {
                    list.add(1);
                }
            }
            res.add(list);
        }
        return res;
    }
}
