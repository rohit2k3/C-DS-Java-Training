package JavaPrograms;

import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kg: ");
        float weight = sc.nextFloat();
        System.out.print("Enter the height in cm: ");
        float height = sc.nextFloat();
        height = height/100;
        float res = weight / (height*height);
        System.out.println("BMI is "+res);
    }
}

