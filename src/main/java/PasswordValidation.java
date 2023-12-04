import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordValidation {
    public static boolean hasNumbers = false;
    public static boolean hasUpperCase = false;
    public static boolean hasLowerCase = false;
    public static boolean hasSpecialCharacters = false;
    public static boolean isNew = true;
    public static String numbers = "1234567890";
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    public static String[] badPasswords = {"123456", "123456789", "qwerty", "Passwort", "password", "1234567", "12345678", "12345", "iloveyou", "111111", "123123"};
    public static SecureRandom randomIndex = new SecureRandom();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired password length (at least 8): ");
        int passwordLength = scanner.nextInt();
        String generatedPassword = newPasswordGenerator(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
    public static boolean lengthCheck(String password) {
        return password.length() >= 8;
    }
    public static boolean numbersCheck(String password) {
        char[] passwordChar = password.toCharArray();
        int counter = 0;
        for (char c : passwordChar) {
            if (numbers.contains(String.valueOf(c))) {
                counter++;
            }
            if (counter > 0) {
                hasNumbers = true;
            }
        }
        return hasNumbers;
    }
    public static boolean upperCaseCheck(String password) {
        int counter = 0;
        char[] passwordChar = password.toCharArray();
        for (char c : passwordChar) {
            if (abc.toUpperCase().contains(String.valueOf(c))) {
                counter++;
            }
            if (counter > 0) {
                hasUpperCase = true;
            }
        }
        return hasUpperCase;
    }
    public static boolean lowerCaseCheck(String password) {
        int counter = 0;
        char[] passwordChar = password.toCharArray();
        for (char c : passwordChar) {
            if (abc.contains(String.valueOf(c))) {
                counter++;
            }
            if (counter > 0) {
                hasLowerCase = true;
            }
        }
        return hasLowerCase;
    }
    public static boolean specialCharactersCheck(String password) {
        char[] fromPassword = password.toCharArray();
        int counter = 0;
        for (char c : fromPassword) {
            if (specialCharacters.contains(String.valueOf(c))){
                counter++;
            }
            if(counter>0){
                hasSpecialCharacters = true;
            }

        }return hasSpecialCharacters;
    }
    public static boolean oldPasswordCheck(String password) {
        int counter = 0;
        for(String c: badPasswords){
            if(password.contains(c)){
                counter++;
            }
            if(counter>0){
                isNew = false;
            }
        }
        return isNew;
    }
    public static String newPasswordGenerator(int howLong) {
        StringBuilder newPassword = new StringBuilder();
        String allCharacters = abc + abc.toUpperCase() + numbers + specialCharacters;
        while (newPassword.length() < howLong) {
            char randomCharacter = allCharacters.charAt(randomIndex.nextInt(allCharacters.length()));
            newPassword.append(randomCharacter);
        }
        if(newPassword.length()>=8){
            hasNumbers = numbersCheck(newPassword.toString());
            hasUpperCase = upperCaseCheck(newPassword.toString());
            hasLowerCase = lowerCaseCheck(newPassword.toString());
            hasSpecialCharacters = specialCharactersCheck(newPassword.toString());
            isNew = oldPasswordCheck(newPassword.toString());
        }
        if ((newPassword.length() < 8) || !hasNumbers || !hasUpperCase || !hasLowerCase || !hasSpecialCharacters || !isNew) {
            return newPasswordGenerator(howLong);
        }
        return newPassword.toString();
    }
}
