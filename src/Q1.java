import java.util.Scanner;

public class Q1 {

    public static final int ABSOLUTE  = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        if (userInput >= 0) {
            System.out.println("your value is : " + userInput);

        } else {
            System.out.println("your value is : " + userInput * ABSOLUTE);
        }
    }
}