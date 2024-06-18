package rohan.array;

import java.util.Scanner;

public class IsArrSorted {
    public static void main(String[] args) {
        int [] arr = buildarray();
        System.out.println("The rohan.array is sorted: "+isSorted(arr));
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
    static boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
