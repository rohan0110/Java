package rohan.array;

public class MoveZero {
    public static void main(String[] args) {
        int [] nums = {1,2,0,4,0,6,0,0,9};
        int n = nums.length;
        moveZeros(nums);
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

    }
    static int[] moveZeros(int[] nums){
        int j= -1;
        int n = nums.length;
        for (int i =0;i<n;i++){
            if (nums[i]==0){
                j=i;
                break;
            }
        }
        if (j == -1) return nums;
        for (int i=j+1; i<n;i++){
            if (nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
