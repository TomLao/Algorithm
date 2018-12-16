package LeetCode_Java;

public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (i != index) {
                    nums[i] = 0;
                }
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
