package rohan.binarysearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums,target);
        if (ans==-1){
            System.out.println("target is found");
        }else{
            System.out.println("Target is found in the following index: "+ans);
        }
    }
    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target<=nums[mid]){
                    high = mid -1;
                }else {
                    low = mid+1;
                }
            }else {
                if(nums[mid] <= target && target<=nums[high]){
                    low = mid + 1;
                }else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
