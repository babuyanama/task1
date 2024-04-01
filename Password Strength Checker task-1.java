import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (isStrongPassword(password)) {
            System.out.println("Strong password!");
        } else {
            System.out.println("Weak password! Please make sure your password meets the following criteria:");
            System.out.println("- At least 8 characters long");
            System.out.println("- Contains at least one uppercase letter");
            System.out.println("- Contains at least one lowercase letter");
            System.out.println("- Contains at least one digit");
            System.out.println("- Contains special characters");
        }
    }

    public static boolean isStrongPassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        // Check for uppercase, lowercase, digits, and special characters
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (isSpecialCharacter(c)) {
                hasSpecialCharacter = true;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialCharacter;
    }

    public static boolean isSpecialCharacter(char c) {
        // Define special characters
        String specialCharacters = "!@#$%^&*()-+";

        // Check if the character is a special character
        return specialCharacters.contains(String.valueOf(c));
    }
}
