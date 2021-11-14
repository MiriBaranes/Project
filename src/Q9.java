import java.util.Scanner;

public class Q9 {
    public static void main(String[] arge) {
        int positiveNumber = positiveNumber();
        checkForPrimeNumber(positiveNumber);
        for (int i = 2; i < positiveNumber; i++) {
            boolean isPrime = checkForPrimeNumber(i);

            if (isPrime == true) {

                System.out.print(i + " ");
            }
        }
        System.out.println("These are all prime numbers from a number to the number you selected.");
    }

    public static boolean remainingDivision(int num1, int num2) {
        boolean dividedWithResidue;

        if (num1 % num2 != 0) {
            dividedWithResidue = false;
        } else {
            dividedWithResidue = true;
        }
        return dividedWithResidue;

    }

    public static boolean checkForPrimeNumber(int numberForCheck) {

        boolean isPrime = true;

        if (numberForCheck==1){
            isPrime = false;
        }

        for (int i = 2; i < numberForCheck; i++) {
            if (remainingDivision(numberForCheck, i) == true) {
                isPrime = false;
            }

        }

        return isPrime;
    }


    public static int positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter a positive number : ");
            userInput = scanner.nextInt();
        }
        while (userInput < 0);

        return userInput;
    }

}





