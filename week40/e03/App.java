import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        
        System.out.println("You entered: " + name);

        String reName = new StringBuilder(name).reverse().toString();
        
        for (int i = 0; i < reName.length(); i++) {
            System.out.println(reName.charAt(i));
        }
        
        scanner.close();
    }
}
