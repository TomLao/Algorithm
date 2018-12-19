package LeetCode_Java;

import java.util.HashMap;

public class Two_Sum_II_Input_array_is_sorted_167 {
//    二分查找，时间O(nlogn), 空间O(1)，超越15%.。。。
//    public int[] twoSum(int[] numbers, int target) {
//        int temp, left, right, mid;
//        int[] res = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            temp = target - numbers[i];
//            left = i+1;
//            right = numbers.length-1;
//            mid = (left+right)/2;
//            while(left <= right){
//                if (numbers[mid] == temp){
//                    res[0] = i+1;
//                    res[1] = mid +1;
//                    return res;
//                }
//                else if (numbers[mid] > temp){  //在左边
//                    right = mid-1;
//                }
//                else{
//                    left = mid+1;
//                }
//                mid = (left+right)/2;
//            }
//        }
//        return res;
//    }

    //使用hashmap，超越18%.。。。
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target - numbers[i])){
                res[0] = i+1;
                res[1] = map.get(target - numbers[i]) +1;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Two_Sum_II_Input_array_is_sorted_167 a = new Two_Sum_II_Input_array_is_sorted_167();
        int[] res = a.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }
}
