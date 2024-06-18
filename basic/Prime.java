package rohan.basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        System.out.println("Prime number: " + isPrime);
    }
    static boolean isPrime(int n) {
        int c = 2;
        if (n <= 1) {
            return false;
        }
        while (c*c <= n){
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return (c*c >= n);
    }
}
