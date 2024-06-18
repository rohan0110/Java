package rohan.basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1,temp=0;
        while (n!=0) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(a>n){
                n=a;
            }
            if(a==0){
                break;
            }
        }
        System.out.println("The largest number is "+n);
    }
}
