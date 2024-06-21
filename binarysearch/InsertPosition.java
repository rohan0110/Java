package rohan.binarysearch;

public class InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int target = 2;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }
    static int searchInsert(int[] nums, int target) {
        int ans = nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                ans=mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
}
