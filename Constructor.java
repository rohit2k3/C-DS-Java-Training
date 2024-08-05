package JavaPrograms;

import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fname ");
        String fname = sc.nextLine();
        System.out.print("\nEnter lname ");
        String lname = sc.nextLine();
        NameConcatenate ss = new NameConcatenate(fname , lname);
        System.out.println(ss.outputPrint());
    }
}

class NameConcatenate{
    public NameConcatenate(String fname , String lname){
        this.fname = fname;
        this.lname = lname;
    }
    String fname;
    String lname;

    public String outputPrint(){
        return fname+ " " + lname;
    }

}
