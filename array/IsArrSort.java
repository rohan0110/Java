package rohan.array;

public class IsArrSort {
    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        int n = nums.length;
        int k=0;
        boolean flag = false;
        while (k<n) {
            flag = check(nums);
            if (flag){
                System.out.println("rohan.array is sorted: "+flag);
                break;
            }
            rotateRightbyOne(nums);
            k++;
        }
        if (!flag){
            System.out.println("rohan.array is sorted: "+flag);
        }
    }
    static boolean check(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    static void rotateRightbyOne(int[] nums) {
        int n = nums.length;
        int temp = nums[n-1];
        for (int i=n-1;i>0;i--){
            nums[i]= nums[i-1];
        }
        nums[0]=temp;
    }

}
