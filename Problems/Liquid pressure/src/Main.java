import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double p = scanner.nextDouble();
        double h = scanner.nextDouble();
        double g = 9.8;
        double P = p * h * g;
        System.out.println(P);
    }
}