package JavaPrograms.String;

import java.util.HashSet;
import java.util.Set;

public class FindRepChar {
    public static void main(String[] args) {

        System.out.println(repeatCheck("Sakshi"));
    }

    public static int repeatCheck(String data){
        Set<Character> ss = new HashSet<>();
        data = data.toLowerCase();
        for (int i = 0; i < data.length(); i++) {

            ss.add(data.charAt(i));
        }


        return data.length() - ss.size();
    }
}
