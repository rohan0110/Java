package rohan.array;

public class RotateRightbyK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int n = nums.length;
        rotateRightbyK(nums, k);
        System.out.println("The rohan.array after rotating right is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    static void rotateRightbyK(int[] nums, int k) {
        int n = nums.length;
        if(k==0)return;
        k=k%n;
        int[] temp = new int[k];
        for (int i = n-k; i < n; i++) {
            temp[i-(n-k)] = nums[i];
        }
        for (int i = n-k-1; i>=0; i--) {
            nums[i+k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
