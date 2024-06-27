package rohan.patterns;

public class KitePattern {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 0; row<2*n; row++){
            int totalColumnsInRow = row>n? 2*n-row : row;
            int totalSpacesInRow =  n - totalColumnsInRow;
            for (int s = 0;s<totalSpacesInRow;s++){
                System.out.print(" ");
            }
            for (int col = 0;col<totalColumnsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
