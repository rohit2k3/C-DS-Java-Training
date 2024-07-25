package JavaPrograms;

import java.lang.management.MemoryType;
import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Generate();
    }
    public static void Generate(){
        Random num = new Random();
        System.out.println(num.nextInt(9999));

    }
}
