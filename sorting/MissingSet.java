package rohan.sorting;

import java.util.ArrayList;
import java.util.List;

public class MissingSet {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while (i< nums.length){
            if (nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else i++;
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index]!= index +1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }
    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
