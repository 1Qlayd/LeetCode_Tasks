import java.util.Arrays;

public class IntersectionofTwoArrays{
    
    public static void main(String[] args) {
    }   
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int minSizeArray = Math.min(nums1.length, nums2.length);
        int[] arrResult = new int[minSizeArray];
        int indexPos = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    arrResult[indexPos++] = nums1[i];
                    break;
                }
            }
        }
        arrResult = Arrays.copyOf(arrResult, indexPos);
        return arrResult; // todo сделать вывод, так чтобы не было повторяющихся чисел в финальном массиве
    }
}