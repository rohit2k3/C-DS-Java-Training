package com.rohit.Learnovate.String;

public class ReverseString {
    public static void main(String[] args) {
        String name = "rohit";
        System.out.println(ReverseString(name));
    }
    public static char[] ReverseString(String name){
        int start = 0;
        char[] charArray = name.toCharArray();
        int end = name.length() - 1;
        while (end >= start ){
            //swap char
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            end--;
            start++;
        }
        return charArray;
    }
}
