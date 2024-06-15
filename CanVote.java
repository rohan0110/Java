package rohan;

import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        String ans = VerifyAge(age);
        System.out.println("Voter is " + ans);
    }
    static String VerifyAge(int age) {
        String status = "Not Eligible";
        if (age >= 18) {
            status = "Eligible";
            return status;
        }else return status;
    }
}
