package rohan.array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSubArray(nums);
        System.out.println("Maximum Subarray: "+sum);
    }
    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0;i< nums.length;i++){
            sum+=nums[i];
            if (sum>max){
                max = sum;
            }
            if (sum<0){
                sum=0;
            }
            if (max<0)max=0;
        }
        return max;
    }
}
