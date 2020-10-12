import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String ticket = sc.next();
        int first_num = 0, second_num = 0;
        for (int i = 0; i < ticket.length() / 2; i++) {
            char ch = ticket.charAt(i);
            first_num += Character.getNumericValue(ch);
        }
        for (int i = ticket.length() / 2; i < ticket.length(); i++) {
            char ch = ticket.charAt(i);
            second_num += Character.getNumericValue(ch);
        }
        if (first_num == second_num) {
            System.out.println("Lucky");
        } else
            System.out.println("Regular");
    }
}