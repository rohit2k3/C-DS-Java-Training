package JavaPrograms;

public class PrintandSum {
    public static void main(String[] args) {
        int sum = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
            if (i%2 == 0){
                evenSum += i;
            }else {
                oddSum += i;
            }
        }
        System.out.println();
        System.out.println("Total Sum is " + sum);
        System.out.println("Total Odd Number Sum is " + oddSum);
        System.out.println("Total Even Number Sum is " + evenSum);
    }
}
