package JavaPrograms;

import java.util.Scanner;

public class CurrencyConvertor {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1 for usd to inr");
        System.out.println("2 for int to inr");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                USDTOINR();
                break;
            case 2:
                INRTOUSD();
                break;
            default:
                System.out.println("Invalid choice");
        }


    }
    public static void USDTOINR (){
        System.out.print("Enter amount is: ");
        float amount = sc.nextFloat();
        float usdPrice = 83.73F;
        System.out.println("Usd to INR is "+ amount*usdPrice);
    }
    public static void INRTOUSD (){
        float usdPrice = 83.73F;
        System.out.print("Enter amount is: ");
        float amount = sc.nextFloat();
        System.out.println("INR to usd is "+ amount/usdPrice);
    }
}
