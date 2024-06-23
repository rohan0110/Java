package rohan.binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
        System.out.println(rotationCount(nums));
    }

    public static int rotationCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // If the array is not rotated at all
        if (nums[start] < nums[end]) {
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            // Check if the mid element is the minimum element
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else if (nums[mid] >= nums[start]) {
                start = mid + 1;
            }
        }

        return -1;  // This should never be reached if the input array is a rotated sorted array
    }
}
