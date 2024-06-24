package rohan.sorting;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] nums = {5,6,4,3,1,2};
        cyclesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void cyclesort(int[] nums){
        int i =0;
        while (i< nums.length){
            if (nums[i]!=i+1){
                swap(nums,i,nums[i]-1);
            }else i++;
        }
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
