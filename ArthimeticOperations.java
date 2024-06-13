package rohan;

import java.util.Scanner;

public class ArthimeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the number 2 : ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the operation +,-,*,/ : ");
        char op = sc.next().charAt(0);

        if (op == '+'){
            double ans = num1 + num2;
            System.out.println("answer is : "+ans);
        }
        else if (op == '-'){
            double ans = num1 - num2;
            System.out.println("answer is : "+ans);
        }
        else if (op == '*'){
            double ans = num1 * num2;
            System.out.println("answer is : "+ans);
        }
        else if (op == '/'){
            double ans = num1 / num2;
            System.out.println("answer is : "+ans);
        }
        else {
            System.out.println("Invalid operation");
        }
    }
}
