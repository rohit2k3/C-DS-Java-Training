package JavaPrograms.Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] names = {"Rohit" , "Vivek" , "Rohan" , "Nitesh"};

        for (String name : names){
            System.out.println(name);
        }

        System.out.println(Arrays.toString(names));
    }
}
