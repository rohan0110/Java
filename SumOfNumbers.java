package rohan;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of numbers : ");
        int n = sc.nextInt();
        int sum = 0;
        int number = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Enter the number"+i+" : ");
            number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("The sum of the "+n+" numbers is : "+sum);
    }
}
