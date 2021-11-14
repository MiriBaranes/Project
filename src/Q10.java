import java.util.Random;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1000) + 1;
        int guess = 0;
        int counter = 0;
        int turn = 0;

        boolean isFinished = false;

        while (isFinished == false) {

            if (turn == 0) {

                System.out.println("Player one make your guess: ");
                guess = scanner.nextInt();
                counter++;

                isFinished = check(number, guess);

                if (isFinished == true) {
                    System.out.println("Player 1 won in " + counter + " turns");
                }
                turn = 1;
            } else {

                System.out.println("Player two make your guess: ");
                guess = scanner.nextInt();
                counter++;
                isFinished = check(number, guess);

                if (isFinished == true) {
                    System.out.println("Player 2 won in " + counter + " turns");
                }
                turn = 0;

            }
        }
    }
            public static boolean check(int number, int playerGuess){

                if (number < playerGuess) {
                    System.out.println("The number you selected is greater than the number drawn");


                } else if (number > playerGuess) {
                    System.out.println("The number you selected is less than the number drawn");

                } else {
                    return true;
                }
                return false;
            }
        }


