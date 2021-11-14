import java.util.Scanner;

public class Q6 {
    public static void main (String[] arge){
        Scanner scanner = new Scanner(System.in);

        int firstNumberInTheSeries;
        int differenceNumberInTheSeries;
        int arrayOfNumbers;

        System.out.println ("Enter The first number in the series:  ");
        firstNumberInTheSeries = scanner.nextInt();
        System.out.println ("Enter the difference number in the series");
        differenceNumberInTheSeries = scanner.nextInt();
        do {
            System.out.println ("Enter the array of numbers- only positive numbers!");
            arrayOfNumbers = scanner.nextInt();
        }
        while (arrayOfNumbers < 0);

        printSeriesNumbers(firstNumberInTheSeries, differenceNumberInTheSeries, arrayOfNumbers);



    }
    public static void printSeriesNumbers (int firstNumInTheSeries, int differenceNumberInTheSeries , int arrayOfNumbers){

        int count = 0;

        for (int i = 0 ; i < arrayOfNumbers; i++){
            System.out.print(firstNumInTheSeries + count + ", ");
            count += differenceNumberInTheSeries;
        }
    }
}