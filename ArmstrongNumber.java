package rohan;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,temp,sum=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        temp = n;
        while(n!=0) {
            r = (n%10);
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }
    }
}
