package LeetCode_Java;

public class Missing_Number_268 {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
    /**
     * 这题都提交了4遍才过，这么简单的数学题，一定要考虑好
     */
}
