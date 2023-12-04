public class PasswordValidation {
    public static boolean hasNumbers = false;
    public static boolean hasUpperCase = false;
    public static boolean hasLowerCase = false;
    public static boolean hasSpecialCharacters = false;
    public static String numbers = "1234567890";
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
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
}
