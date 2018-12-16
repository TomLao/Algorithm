package LeetCode_Java;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;  //把存在的数在原数组用负号表示
            if (nums[temp] > 0) {
                nums[temp] = -nums[temp];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)  //表示不存在
                list.add(i + 1);
        }
        return list;
    }

    /*
    还得多做几遍！
    这个真的厉害，不使用额外空间，且时间O(n)。
     */
}
