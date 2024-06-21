package rohan.binarysearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        int ans = lowerBound(nums, target);
        System.out.println(ans);
    }
    static int lowerBound(int[] nums, int key) {
        int ans = nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= key) {
                ans=mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
}
