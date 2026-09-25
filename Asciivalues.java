import java.util.Scanner;
public class Asciivalues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sum += (int) ch;
        }
        System.out.println("sum of ASCII values of '" + str + "' is: " + sum);
        scanner.close();
    }
}
