import java.util.Scanner;

public class Q4 {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello This software solves a quadratic equation, please register 'a' :");
        int a = scanner.nextInt();
        System.out.println("please Enter 'b' ");
        int b = scanner.nextInt();
        System.out.println("please Enter 'c' ");
        int c = scanner.nextInt();

        double root = ((Math.pow(b,2)) - 4 * a * c);
        double solutionRoot = Math.sqrt(root);
        double result1 = ((-1*b + solutionRoot)/2*a);
        double result2 = ((-1*b - solutionRoot)/2*a);
        if (root < 0) {
            System.out.println("There is no solution");
        }
         else if (solutionRoot == 0){
            System.out.println("There is one solution X= " +(result1));
        }
         else {
            System.out.println("There is 2 solution:" );
            System.out.println("x1=  " + (result1));
            System.out.println("x2=  " +(result2));
        }
    }
}

