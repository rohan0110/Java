package rohan.patterns;

public class NumberSquarePattern {
    public static void main(String[] args) {
        int n= 4;
        int N = 2*n-1;
        for (int row = 1; row <= N; row++) {
            for (int col = 1; col <= N; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(N-row+1, N-col+1))+1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}



