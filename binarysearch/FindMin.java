package rohan.binarysearch;

public class FindMin {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int ans=Integer.MAX_VALUE;

            while (left <= right) {
                if(nums[left]<=nums[right])
                {
                    ans=Math.min(ans,nums[left]);
                    break;
                }
                int mid = left + (right - left) / 2;
                ans=Math.min(ans,nums[mid]);
                if(nums[mid]>=nums[left])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
            return ans;

        }
}
