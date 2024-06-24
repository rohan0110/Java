package rohan.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 15, 6, 79, 8, 90 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last  = arr.length-i-1;
            int maxIndex = maxindex(arr, 0, last);
            swap(arr, maxIndex,last);
        }
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int maxindex (int[] arr,int start,int last) {
        int maxindex = start;
        for(int i=start;i<=last;i++) {
            if(arr[i]>arr[maxindex]) {
                maxindex = i;
            }
        }
        return maxindex;
    }
}
