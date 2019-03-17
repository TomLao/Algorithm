package LeetCode_Java;

public class complement_of_base_10_integer_1012 {
    public int bitwiseComplement(int N) {
        String res = Integer.toBinaryString(N);
        for (int i=0; i<res.length(); i++)
            res.replace(res.charAt(i), res.charAt(i)=='1'?'0':'1');

        System.out.println(res);
        return Integer.parseInt(res, 2);
    }
}
