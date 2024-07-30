package JavaPrograms;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rohit");
        names.add("Satyam");
        names.add("Spriha");
        names.add("Sakshi");
        names.add("Spriha");

        int dublicate = 0;
        for (int i = 0 ; i < names.size(); i++) {
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    dublicate++;
                }
            }
        }
        System.out.println("Total dublicate elements are: "+ dublicate);

//        System.out.println(names.get(names.size()/2));
    }
}
