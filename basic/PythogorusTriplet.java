package rohan.basic;

import java.util.Scanner;

public class PythogorusTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        String triplet = pythogorusTriplet(a, b, c);
        System.out.println("The given Nos are pythagorean triplet: "+triplet);
    }
    static String pythogorusTriplet(int a, int b, int c) {
        String result = "";
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return result = "Yes";
        } else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            return result = "Yes";
        }else if (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2)) {
            return result = "Yes";
        }else return result = "No";
    }
}
