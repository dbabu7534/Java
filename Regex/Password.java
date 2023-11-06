import java.util.Scanner;
import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword;

        try {
            System.out.print("Enter a password: ");
            inputPassword = "Dinesh @123";
            validatePassword(inputPassword);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Password is invalid. " + e.getMessage());
        }

        scanner.close();
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        String spaceRegex = ".*\\s.*";
        String specialCharRegex = ".*[^a-zA-Z0-9\\s].*";
        String numberRegex = ".*\\d.*";

        if (!password.matches(spaceRegex) || !password.matches(specialCharRegex) || !password.matches(numberRegex)) {
            throw new InvalidPasswordException("Password must contain at least one space, one special character, and one number.");
        }
    }
    
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
