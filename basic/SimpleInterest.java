package rohan.basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount: ");
        double principleAmount = sc.nextDouble();
        System.out.println("Enter Duration in years: ");
        int duration = sc.nextInt();
        System.out.println("Enter Rate of Intrest: s");
        float rateOfIntrest = sc.nextFloat();

        double intrest = (principleAmount * duration * rateOfIntrest)/100;
        System.out.println("Your Simple Interest is : "+intrest);
    }
}
