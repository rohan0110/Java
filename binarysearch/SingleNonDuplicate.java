package rohan.binarysearch;

public class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums){
        int n = nums.length;
        int left = 1;
        int right = n - 2;
        if(n==1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] != nums[mid+1]&&nums[mid] != nums[mid-1]){
                return nums[mid];
            }else if(mid%2==0 && nums[mid] == nums[mid+1] || mid%2==1 && nums[mid] == nums[mid-1]){
                left = mid + 1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        System.out.println(singleNonDuplicate(nums));
    }
}
