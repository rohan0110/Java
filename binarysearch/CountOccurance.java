package rohan.binarysearch;

public class CountOccurance {
        public static int occurance(int[] nums, int target) {
            int first = findFirst(nums, target);
            int last = findLast(nums, target);
            if (first == -1){
                return 0;
            }
            return last-first+1;
        }

        private static int findFirst(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    if (mid == 0 || nums[mid - 1] != target) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }

        private static int findLast(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            rohan.binarysearch.FirstAndLast solution = new rohan.binarysearch.FirstAndLast();
            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 0;
            int result = occurance(nums, target);
            System.out.println("No of occurances  of " + target+" is "+result );
        }
}
