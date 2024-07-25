package JavaPrograms.Array;

public class AverageSum {
    public static void main(String[] args) {
        int nos[] = {1,7,3,11,24,9};
        int sum = 0;
        for(int num : nos){
            sum+=num;
        }
        System.out.println("Average of sum is : " + (sum/nos.length));
    }
}
