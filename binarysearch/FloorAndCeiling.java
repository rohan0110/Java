package rohan.binarysearch;

import java.util.Arrays;

public class FloorAndCeiling {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int target = 8;
        System.out.println(Arrays.toString(floorAndCeiling(arr, target)));
    }
    public static int[] floorAndCeiling(int[] arr, int target) {
        int floor = floor(arr, target);
        int ceiling = ceiling(arr, target);
        return new int[] { floor, ceiling };
    }
    public static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans =-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans =-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
