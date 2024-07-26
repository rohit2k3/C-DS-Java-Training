package JavaPrograms.String;

import java.util.Random;

public class PasswordGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static void main(String[] args) {
        int passwordLength = 10; // specify the desired password length
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
    private static String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();
    }
}
