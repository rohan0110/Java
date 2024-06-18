package rohan.array;

import java.util.Arrays;

public class RotateLeftByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rotateLeftByOne(arr);
    }
    static void rotateLeftByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("Rotated Array: "+ Arrays.toString(arr));
    }
}
