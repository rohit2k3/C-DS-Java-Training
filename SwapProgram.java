package JavaPrograms;

public class SwapProgram {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;
        swapWithoutThird(a,b);
        SwapWithThird(a ,b);
    }

    public static void SwapWithThird(int a , int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void swapWithoutThird(int a , int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a+b;
        b  = a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
