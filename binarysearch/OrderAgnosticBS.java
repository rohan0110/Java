package rohan.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 10,9,8,7,6,5,4,3,2,1 };
        int target = 2;
        int temp = orderagnosticbinarySearch(arr,target);
        if (temp == -1){
            System.out.println(target+" is not present in array");
        }else System.out.println(target+" is present in array");
    }
    static int orderagnosticbinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        boolean isAsc = arr[low] <= arr[high];
        while (low <= high) {
            int mid = (high +low) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < key) {
                    low = mid + 1;
                }else high = mid - 1;
            } else{
                if (arr[mid] < key) {
                    high = mid - 1;
                }else low = mid + 1;
            }
        }
        return -1;
    }
}
