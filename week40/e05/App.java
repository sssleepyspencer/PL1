import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder names = new StringBuilder();
        
        while (true) { 
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();
            if (name.equals("Quit")) {
                break;
            } else {
                names.append(name);
                System.out.println(names.toString());
            }
        }
        
        scanner.close();
    }
}


