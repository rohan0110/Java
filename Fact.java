package rohan;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println(fact);
    }
    static int fact(int n) {
        int fact = 1;
        if (n == 0){
            return 1;
        } else if (n == 1) {
            return 1;
        }
        else {
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
}
