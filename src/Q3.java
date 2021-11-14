import java.util.Scanner;

public class Q3 {
    public static void main(String[] arge) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int userInput1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int userInput2 = scanner.nextInt();
        System.out.println("Enter the Third number : ");
        int userInput3 = scanner.nextInt();
        int max, mid, min;


        if (userInput1 >= userInput2 && userInput1 >= userInput3) {
            max = userInput1;
            if (userInput2 >= userInput3) {
                mid = userInput2;
                min = userInput3;
                System.out.println(min +" " + mid + " " +max);
            } else {
                mid = userInput3;
                min = userInput2;
                System.out.println(min +" " + mid + " " +max);
            }
        }
        else if (userInput2 >= userInput1 && userInput2 >= userInput3) {
            max = userInput2;
            if (userInput1 >= userInput3) {
                mid = userInput1;
                min = userInput3;
                System.out.println(min +" " + mid + " " +max);
            } else {
                mid = userInput3;
                min = userInput1;
                System.out.println(min +" " + mid + " " +max);
            }
        }
        else {
            max = userInput3;
            if (userInput1 >= userInput2) {
                mid = userInput1;
                min = userInput2;
                System.out.println(min +" " + mid + " " +max);
            } else {
                mid = userInput2;
                min = userInput1;
                System.out.println(min +" " + mid + " " +max);
            }
        }
    }
}

