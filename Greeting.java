package rohan;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your name");
        String a = in.nextLine();
        System.out.println("hello " + a);
    }
}
