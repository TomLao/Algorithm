package LeetCode_Java;

public class _1_bit_and_2_bit_Characters_717 {

    //这个题不错
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;   //如果bits[i]为0,当前1bit,直接下1位。如果bits[i]==1,当前2bit,跳过1个,加2。
        }
        return i == bits.length - 1;//按照上面的规则跳动，false为最后为2bit，跳超过了。true为最后为1bit,跳得刚刚好。
    }

    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int[]{1,0,0}));
    }
}
