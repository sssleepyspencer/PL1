import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindrome test, please enter some text: ");
        String test = scanner.nextLine();

        String normalizedTest = test.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reTest = new StringBuilder(normalizedTest).reverse().toString();
        
        if (normalizedTest.equals(reTest)) {
            System.out.println(test + " is a palindrome");
        } else {
            System.out.println(test + " is not a palindrome");
        }
        
        scanner.close();
    }
}
