import java.util.Scanner;

public class Q8 {

    public static final int BIGGEST_NUMBER = 20;
    public static final int SMALLEST_NUMBER = 5;

    public static void main(String[] arge) {
        int numberValue = inputNumber();
        asterisksPrint(numberValue);

    }

    public static int inputNumber() {

        Scanner scanner = new Scanner(System.in);
        int numberValue;

        do {
            System.out.println("Enter a number between 5 to 20 including: ");
            numberValue = scanner.nextInt();
        }
        while (numberValue > BIGGEST_NUMBER || numberValue < SMALLEST_NUMBER);

        return numberValue;
    }

    public static void asterisksPrint(int numberInput){


        for (int i=0 ; i <= numberInput ; i++ ) {
            System.out.println(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.print(" ");
        }


    }

