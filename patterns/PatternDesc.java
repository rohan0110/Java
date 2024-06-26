package rohan.patterns;

public class PatternDesc {
    public static void main(String[] args) {

        int n = 5;
        for(int row = n; row>0;row--){
            for (int col = 0;col<row;col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
