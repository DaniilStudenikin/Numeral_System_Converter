import java.util.*;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var requiredUpperCase = scanner.nextInt();
        var requiredLowerCase = scanner.nextInt();
        var requiredDigits = scanner.nextInt();
        var requiredLength = scanner.nextInt();

        var password = new StringBuilder(requiredLength);

        for (int i = 0; i < requiredUpperCase; i++) {
            password.append(i % 2 == 0 ? 'A' : 'B');
        }

        for (int i = 0; i < requiredLowerCase; i++) {
            password.append(i % 2 == 0 ? 'a' : 'b');
        }

        for (int i = 0; i < requiredDigits; i++) {
            password.append(i % 2 == 0 ? '1' : '2');
        }

        for (int i = password.length(); i < requiredLength; i++) {
            password.append(i % 2 == 0 ? 'A' : 'B');
        }

        System.out.println(password.toString());
    }
}