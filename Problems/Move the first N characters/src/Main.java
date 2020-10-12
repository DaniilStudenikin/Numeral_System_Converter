import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = sc.nextInt();
        String newString = "";
        if (num < s.length()) {
            newString += s.substring(num);
            newString += s.substring(0, num);
            System.out.println(newString);
        } else System.out.println(s);
    }
}