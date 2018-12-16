package LeetCode_Java;

public class Remove_Element_27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[index] = nums[i];
                if(i!=index){
                    nums[i] = val;
                }
                index++;
            }
        }
        return index;
    }

    /*
    这个跟283的移0是一毛一样的。。。
     */
}
