import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            System.out.print("Input: ");
            String password = scanner.nextLine();
            
            if (password.length() < 8) {
                System.out.println("Password is invalid. It must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, and one digit.");
                continue;
            }

            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }
                if (Character.isLowerCase(ch)) {
                    hasLowercase = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            if (hasUppercase && hasLowercase && hasDigit) {
                System.out.println("Output: Password is valid.");
                break; 
            } else {
                System.out.println("Password is invalid. It must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, and one digit.");
            }
        }
        
        scanner.close();
    }
}
