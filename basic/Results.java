package rohan.basic;

import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String grade = printGrade(marks);
        System.out.println("Your grade is " + grade);
    }
    static String printGrade(int marks) {
        String grade = "";
        if (marks >= 91) {
            return grade = "AA";
        }else if (marks >= 81) {
           return grade = "AB";
        }else if (marks >= 71) {
           return grade = "BB";
        }else if (marks >= 61) {
           return grade = "BC";
        }else if (marks >= 51) {
           return grade = "CD";
        }else if (marks >= 41) {
           return grade = "DD";
        }
        return grade = "Fail";
    }
}
