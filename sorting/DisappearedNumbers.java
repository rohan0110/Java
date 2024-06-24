package rohan.sorting;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> List = (ArrayList<Integer>) findDisappearedNumbers(nums);
        System.out.println(List);
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while (i< nums.length){
            if (nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }else i++;
        }
        List<Integer> List = new ArrayList();
        for (int index = 0; index < nums.length; index++){
            if (nums[index]!= index +1){
                List.add(index +1);
            }
        }
        return List;
    }
}
