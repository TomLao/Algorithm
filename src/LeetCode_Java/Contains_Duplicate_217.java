package LeetCode_Java;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (set.contains(i)) //set集合只能存在一个
                return true;
            set.add(i);
        }
        return false;
    }
}
