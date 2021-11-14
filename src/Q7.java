import java.util.Scanner;

public class Q7 {
    public static final int MAX_INVAILD_DAY = 8;
    public static final int MIN_INVAILD_DAY = 0;
    public static final int MAX_INVAILD_HOUR = 24;
    public static final int MIN_INVAILD_HOUR = 0;

    public static final int MIN_VAILD_HOUR = 9;
    public static final int MAX_VAILD_HOUR = 17;

    public static final int TEUSDAY_MIN_VAILD_HOUR = 8;
    public static final int TEUSDAY_MAX_VAILD_HOUR = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desirableArrivalDay;
        int earliestHour;
        int latestHour;

        System.out.println("Enter the day you wont to arrive 1-Sunday, 2-Monday, 3-Tuesday , 4-Wednesday , 5-Thursday : ");
        desirableArrivalDay = scanner.nextInt();

        if (desirableArrivalDay >= MAX_INVAILD_DAY || desirableArrivalDay <= MIN_INVAILD_DAY) {
            System.out.println("Invalid day - please choose a day between Sunday and Thursday only");
        } else if (desirableArrivalDay == 6 || desirableArrivalDay == 7) {
            System.out.println("Our office is closed on Friday and Saturday.");
        } else {
            System.out.println("Enter the earliest time you can arrive : ");
            earliestHour = scanner.nextInt();
            System.out.println("Enter the latest time you can arrive :");
            latestHour = scanner.nextInt();

            if (earliestHour >= MAX_INVAILD_HOUR || earliestHour <= MIN_INVAILD_HOUR || latestHour >= MAX_INVAILD_HOUR
                    || earliestHour <= MIN_INVAILD_HOUR) {
                System.out.println(" Time does not exist ");
            } else {

                switch (desirableArrivalDay) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                        if (earliestHour < MIN_VAILD_HOUR || earliestHour > MAX_VAILD_HOUR ||
                                latestHour > MAX_VAILD_HOUR || latestHour < MIN_VAILD_HOUR) {
                            System.out.println("Invalid time press - press an hour between 9 a.m. and 5 p.m.");
                        } else if (earliestHour >= MIN_VAILD_HOUR && latestHour <= MAX_VAILD_HOUR && earliestHour < latestHour) {
                            System.out.println("The offices are open you can reach");
                        } else if (earliestHour > latestHour) {
                            System.out.println("The late hour you selected is less than the early hour you selected");
                        }
                        break;
                    case 3:
                        if (earliestHour < TEUSDAY_MIN_VAILD_HOUR || earliestHour > TEUSDAY_MAX_VAILD_HOUR ||
                                latestHour < TEUSDAY_MIN_VAILD_HOUR || latestHour > TEUSDAY_MAX_VAILD_HOUR) {
                            System.out.println("Invalid time press - press an hour between 8 a.m. and 12 p.m.");
                        } else if (earliestHour >= TEUSDAY_MIN_VAILD_HOUR && latestHour <= TEUSDAY_MAX_VAILD_HOUR
                                && earliestHour < latestHour) {
                            System.out.println("The offices are open you can reach");
                        } else {
                            System.out.println("The late hour you selected is less than the early hour you selected");
                        }

                }
            }

        }
    }
}
