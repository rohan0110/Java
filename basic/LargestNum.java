package rohan.basic;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        if(a>b){
            System.out.println(a+"is larger than"+b+".");
        }
        else{
            System.out.println(b+"is larger than"+a+".");
        }
    }
}
