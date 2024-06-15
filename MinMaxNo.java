package rohan;

import java.util.Scanner;

public class MinMaxNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println("Enter your choice: 1:MAXIMUM 2:MINIMUM ");
        int ch = sc.nextInt();
        if (ch == 1){
            int ans = max(a,b,c);
            System.out.println("Maximum No is :"+ans);
        } else if (ch == 2) {
            int ans = min(a,b,c);
            System.out.println("Minimum No is"+ans);

        }else {
            System.out.println("Invalid Choice");
        }
    }
    static int min(int a, int b, int c) {
        if (a < b) if (a < c) {
            return a;
        } else {
            return c;
        }
        else if (b < c) return b;
        else if (c < a) {
            return c;
        } else return a;
    }
    static int max(int a, int b, int c) {
        if (a > b) if (a > c) {
            return a;
        } else {
            return c;
        }
        else if (b > c) return b;
        else {
            if (c > a) return c;
            else return a;
        }
    }
}
