package com.rohit.Learnovate;

import java.util.HashSet;
import java.util.Set;

public class RepeatChar {
    public static void main(String[] args) {
        System.out.println(repeatCheck("saksham"));
    }

    public static int repeatCheck(String data){
        Set<Character> ss = new HashSet<>();
        for (int i = 0; i < data.length(); i++) {

            ss.add(data.charAt(i));
        }


        return data.length() - ss.size();
    }
}
