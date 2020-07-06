
/**
 * Week 2 Group Tutorial Assignment
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 *
 * @author Group 2
 *
 */
import java.util.Scanner;

public class Main {

    public static Date date = new Date();

    public static void main(String[] args) {
        System.out.println("Welcome to the Julian Number to date application");
        // Print user selection menu to screen.
        // Keep appl20ication running until the user selects quit.
        getDateFromUser();
        while (true) {
            System.out.println("Enter your choice\n 1. Enter a Differnt Date"
                    + "\n 2. Get Day \n 3. Get Month \n 4. Get Year"
                    + "\n 5. Leap year check"
                    + "\n 6. Get Max days of month "
                    + "\n 7. Get Julian Number"
                    + "\n 8. Get Date from Julian Number"
                    + "\n 9. Quit");
            // Create a scanner for the user to enter a menu option.
            Scanner scanner = new Scanner(System.in);
            final int choice = scanner.nextInt();

            switch (choice) {
                // The user chooses to enter a Gregorian date.
                case 1:
                    System.out.println("Enter a Differnt Date \n");
                    getDateFromUser();
                    break;
                // The user chooses following options to get day, year and month.
                case 2:
                    System.out.println("Get Day\n");
                    System.out.println("Day: " + date.getDay() + "\n");
                    break;
                case 3:
                    System.out.println("Get Month\n");
                    System.out.println("Month: " + date.getMonth() + "\n");
                    break;
                case 4:
                    System.out.println("Get Year\n");
                    System.out.println("Year: " + date.getYear() + "\n");
                    break;
                // The user chooses to check if the entered year is a leap year or not.
                case 5:
                    System.out.println("Leap year check \n");
                    if (date.isLeapYear(date.getYear())) {
                        System.out.println(date.getYear() + " is a Leap year \n");
                    } else {
                        System.out.println(date.getYear() + " is not a Leap year \n");
                    }
                    break;
                // The user chooses to get maximum number of days in a month.
                case 6:
                    System.out.println("Get Max days of month\n");
                    if (date.getLastDayOfMonth(date.getMonth(), date.getYear()) != -1) {
                        System.out.println("The month " + date.getMonth() + " has "
                                + date.getLastDayOfMonth(date.getMonth(), date.getYear())
                                + " days.\n");
                    } else {
                        System.out.println("Months should be between 1 to 12!!");
                    }
                    break;

                case 7:
                    System.out.println("Get the Julian Number \n");
                    System.out.println(" Julian Number: "+date.getmJulianNumber());
                    break;
                case 8:
                    System.out.println("Get the Gregorian Date from Julian Number \n");
                    System.out.println("Enter a Julian Number");
                    Scanner jNumber = new Scanner(System.in);
                    System.out.println(" Gregorian Date: "+date.getDateFromJulianNumber(jNumber.nextInt()));
                    break;
                // The user quits the application.
                case 9:
                    System.out.println("Quiting....\n");
                    System.exit(0);
                    break;
                // The user enters an incorrect input and is prompted again.
                default:
                    System.out.println("Error: Invalid Data!!, Try again \n");
            }
        }

    }

    /* This method gets a Gregorian date input by the user 
            It requests the year, month, and day as 3 separate inputs.
            This method checks to make sure the month the user inputs is not greater than 12.
            This method checks to make sure the day the user inputs is not greater than 31.
     */
    private static void getDateFromUser() {
        System.out.println("Enter Year");
        Scanner scnYear = new Scanner(System.in);
        date.setYear(scnYear.nextInt());
        System.out.println("Enter Month (As a number 1-12)");
        Scanner scnMonth = new Scanner(System.in);
        int month = scnMonth.nextInt();
        if (month > 12) {
            System.out.println("Month can not be greater than 12. Please re-enter the "
                    + "month.");
        } else {
            date.setMonth(month);
        }

        System.out.println("Enter Day (As a number 1-31)");
        Scanner scnday = new Scanner(System.in);
        int day = scnday.nextInt();
        if (day > 31) {
            System.out.println("Date can not be greater than 31. Please re-enter the date.");
        } else {
            date.setDay(day);
        }
    }
}
