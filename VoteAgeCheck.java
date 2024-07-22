package com.rohit.Learnovate;

public class VoteAgeCheck {
    public static void main(String[] args) {
        int age = 18;

        //without if else
        String message = (age >= 18) ? "You are eligible for voting" : "You are not eligible for voting";
        System.out.println(message);


        if (age >= 18){
            System.out.println("You are eligible for voting");
        }else {
            System.out.println("You are not eligible for voting");
        }
    }
}
