package JavaPrograms;

public class LengthOfname {
    public static void main(String[] args) {
        String name = "Rohit Sharma";
        int count = 0;
        for (char a: name.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
