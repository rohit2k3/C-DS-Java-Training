package com.rohit.Learnovate;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        switch (marks){
            case 10:
                System.out.println("You are failed");
                break;
            case 50:
                System.out.println("You are passed");
                break;
            case 80:
                System.out.println("You are in top 10");
                break;
            case 100:
                System.out.println("You are topper");
                break;
            default:
                System.out.println("Your marks is not in criteria");
                break;
        }
    }
}
