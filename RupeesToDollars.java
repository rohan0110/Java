package rohan;

import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees: ");
        double amt = sc.nextDouble();
        double dollar = amt/80;
        System.out.println("Amount in dollars: $" + dollar);
    }
}
