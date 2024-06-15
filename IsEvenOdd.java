package rohan;

import java.util.Scanner;

public class IsEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        String ans = evenodd(n);
        System.out.println(n+ " is an " +ans+" number");
    }
    static String evenodd(int n){
        String ans = "even";
        if (n%2==0){
            return ans;
        }
        else return ans = "odd";
    }
}
