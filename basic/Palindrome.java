package rohan.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,rev = "";
        System.out.println("Enter string: ");
        str = sc.nextLine();
        int len = str.length();
        for (int i = len-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
