package LeetCode_Java;

public class Sort_Array_By_Parity_905 {
    public int[] sortArrayByParity(int[] A) {
        int idx = 0, temp;
        for (int i = 0; i < A.length; i++) {
            if (A[i]%2==0){
                temp = A[idx];
                A[idx] = A[i];
                A[i] = temp;
                idx++;
            }
        }
        return A;
    }
}
