package com.rohit.Learnovate;

import java.util.Scanner;

public class InputLearn {
    public static void main(String[] args) {
            System.out.print("Enter your age: ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            String ans = (age >= 18) ? "You are eligible for vote" : "You are not eligible for vote";
            System.out.println(ans);
    }
}
