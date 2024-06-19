package rohan.array;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int[] nums = {1,0,2,1,2,1,0};
        sortColors(nums);
        System.out.println("Sorted array: ");
        for (int i = 0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void sortColors(int[] nums){
        int low = 0,mid= 0,high= nums.length-1;
        while (mid<high){
            if (nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]= temp;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else {
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]= temp;
                high--;
            }
        }
    }
}
