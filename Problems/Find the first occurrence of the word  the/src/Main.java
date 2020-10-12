import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
        System.out.println(sentence.indexOf("the"));
    }
}