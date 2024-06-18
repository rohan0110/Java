package rohan.array;

public class RotateLeftbyK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        int d = 5;
        rotateLeft(arr, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateLeft(int[] arr, int n, int d) {
        if (n == 0)
            return;
        d = d % n;
        if (d == 0)
            return;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
