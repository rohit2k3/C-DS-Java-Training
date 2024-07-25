package JavaPrograms;

public class WhileLoopDemo {
    public static void main(String[] args){
       int sum = 0;
       int i = 1;
       while (i <= 10){
           System.out.println(i++);
           sum+=i;
       }
        System.out.println("Total sum is "+ sum);
    }
}
