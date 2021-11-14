import java.util.Scanner;

public class Q5 {
    public static void main(String[] arge) {

        Scanner scanner = new Scanner(System.in);

        int employeeType;
        double worksHours;
        int dailyGoal;
        int continuationAction = 1;

        while (continuationAction == 1) {

            do {
                System.out.println("Tap what type of employee you are, junior employee tap 0, senior employee tap 1 ");
                employeeType = scanner.nextInt();
            }

            while (employeeType < 0 || employeeType > 1);

            do {
                System.out.println("Tap how many hours you worked : ");
                worksHours = scanner.nextDouble();
            }
            while (worksHours < 0);
            System.out.println("Enter how many days you succeed in your daily goal:  ");
            dailyGoal = scanner.nextInt();

            System.out.println ( "your salary is: " + wageCalculation(employeeType, worksHours,dailyGoal));


            System.out.println("Continue ? 1 for yes, any other number for nor: ");
            continuationAction = scanner.nextInt();
        }
    }


    public static double wageCalculation(int employeeType, double worksHours, int dailyGoal) {
        int daylyGoalSalary = 250;
        int hourlyWageJunior= 50;
        int hourlyWageSenior =200;
        double salary;

        if (employeeType == 0) {
            salary = ((worksHours * hourlyWageJunior) + (dailyGoal * daylyGoalSalary));
        }
        else {
            salary = ((worksHours * hourlyWageSenior) + (dailyGoal * daylyGoalSalary));
        }
        return salary;
    }
}




