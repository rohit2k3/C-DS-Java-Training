package JavaPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trainer trainner1 = new Trainer();
        System.out.print("Enter Trainer Name :");
        trainner1.trainername = sc.nextLine();

        System.out.print("Enter Trainer Technology :");
        trainner1.Trainertech = sc.nextLine();


        Students student1 = new Students();
        System.out.print("Enter Student Name :");
        student1.studentName = sc.nextLine();
        System.out.print("Enter student Technology :");
        student1.enrolledTech = sc.nextLine();

        System.out.println("Trainer Name: "+trainner1.trainername);
        System.out.println("Trainer Technology: "+trainner1.Trainertech);


        System.out.println("Student Name: "+student1.studentName);
        System.out.println("Student Technology: "+student1.enrolledTech);

        student1.setName("Rohit Sharmaaaa");
        System.out.println(student1.getName());

    }


}

class Trainer{
    String trainername;
    String Trainertech;

    String JoinName(String fname , String lname){
        return (lname + " " +fname);
    }
    String JoinName(String fname , String midName ,  String lname){
        return (lname + " " + midName + " " +fname);
    }
}
class Students{
    String studentName;
    String enrolledTech;

    void setName(String name){
        this.studentName = name;
    }
    String getName(){
        return this.studentName;
    }
}
