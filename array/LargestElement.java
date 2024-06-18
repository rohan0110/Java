package rohan.array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = buildarray();
        int largest = largestelement(arr);
        System.out.println("Largest Element is "+largest);

    }
    static int[] buildarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rohan.array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static int largestelement(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
