package LeetCode_Java;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = input.containsKey(nums[i]) ? input.get(nums[i]) : 0;
            input.put(nums[i], count + 1);
        }
        int low = nums.length / 2;
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : input.entrySet()) {
            if (entry.getValue() > low) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    /*
    优秀答案：
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
     */
}
