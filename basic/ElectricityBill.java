package rohan.basic;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of units: ");
        int n = sc.nextInt();
        System.out.println("Enter the Month No. :  ");
        int m = sc.nextInt();
        System.out.println("Enter the Charge per unit :  ");
        double c = sc.nextDouble();

        double amt = n * c;
        if (m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
                amt = amt*31;
        } else if (m==2) {
            amt = amt*28;
        }
        else if (m==4||m==6||m==9||m==11) {
            amt = amt*30;
        }
        else{
            System.out.println("Invalid Month");
        }
        System.out.println("The Bill is: Rs." + amt);
    }
}
