package rohan.array;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = buildarray();
        int[] ans = secondlargest(arr);
        System.out.println("The Second maximum and minimum element is : "+ Arrays.toString(ans));
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
    static int[] secondlargest(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int secondmax=Integer.MIN_VALUE;
        int secondmin =Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
            if ( arr[i] < secondmin && arr[i] > min ) {
                secondmin = arr[i];
            }
        }
        int[] arr2 = {secondmax, secondmin};
        return arr2;
    }
}
