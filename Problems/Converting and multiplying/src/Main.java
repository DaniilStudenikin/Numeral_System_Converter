import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        do {
            String s = sc.nextLine();
            if (s.equals("0")) {
                flag = false;
            } else
                list.add(s);
        } while (flag);
        method(list);
    }
    public static void method(ArrayList<String> arr) {
        for (String s : arr) {
            try {
                System.out.println(Integer.parseInt(s) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }

}