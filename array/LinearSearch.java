package rohan.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int num= 10;
        int n = nums.length;
        boolean flag=linearSearch(nums,num);
        System.out.println("Element is present in array: "+flag);
    }
    static boolean linearSearch(int[] nums,int num){
        int n = nums.length;
        for (int i =0;i<n;i++){
            if (nums[i]==num){
                return true;
            }
        }
        return false;
    }
}
