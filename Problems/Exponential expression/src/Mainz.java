import java.util.Scanner;

class Mainz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double x = (double) scanner.nextDouble();
        double answ = x*x*x + x*x + x + 1;
        System.out.println(answ);
    }
}