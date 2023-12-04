public class PasswordValidation {
    public static boolean hasNumbers = false;
    public static String numbers = "1234567890";
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
}
