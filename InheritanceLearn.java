package JavaPrograms;

import java.util.Arrays;

public class InheritanceLearn {

    public static void main(String[] args) {
        GrandParent ss = new GrandParent();
        ss.parentMethod();
        ss.grandMethod();
    }
}

class Parent {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class GrandParent extends Parent{
    void grandMethod(){
        System.out.println("Grand Method");
    }
}