package JavaPrograms;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        do {
            sum+=i;
            System.out.println(i--);
        }while (i > 0);

        String message = (sum % 2 == 0) ? "Sum is even" : "Sum is odd";
        System.out.println(message);
    }
}
