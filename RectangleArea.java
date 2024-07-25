package JavaPrograms;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter legnth: ");
        int len = sc.nextInt();
        System.out.print("Enter bredth: ");
        int bredth = sc.nextInt();
        System.out.println("Area of given data is " + AreaRec(len , bredth));

    }
    public static int AreaRec(int len , int bred){
        return len*bred;
    }
}
