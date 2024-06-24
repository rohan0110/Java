package rohan.sorting;

public class DuplicateNumber {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums) {
        int i =0;
        while (i< nums.length){
            if(nums[i] != i+1){
                if (nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }else return nums[i];
            }else i++;
        }
        return -1;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
