/**
 * Week 2 Group Tutorial Assignment
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Group 2
 * 
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Julian Number to date application");
		// Print user selection menu to screen.
                // Keep application running until the user selects quit.
		while (true) {
			System.out.println("Enter your choice\n 1. Gregorian Date to Julian Number "
                                + "\n 2. Julian Number to Gregorian Date \n 3. Quit \n");
			// Create a scanner for the user to enter a menu option.
			Scanner scanner = new Scanner(System.in);
			final int choice = scanner.nextInt();
			
			switch (choice) {
                        // The user chooses to enter a Gregorian date.
			case 1:
				System.out.println("Enter a Gregorian Date \n");
				getDateFromUser();
				break;
                        // The user chooses to enter a Julian Number.
			case 2:
				System.out.println("Enter a Julian Number \n");
				getNumberFromUser();
				break;
                        // The user quits the application.
			case 3:
				System.out.println("Quiting... \n");
				System.exit(0);
				break;
                        // The user enters an incorrect input and is prompted again.
			default:
				System.out.println("Error: Invalid Data!!, Try again \n");
			}
	}

	}
        /* This method gets a Julian Number input by the user 
            and converts it to a Gregorian date.
            It then prints out the Gregorian date to the screen.
        */
	private static void getNumberFromUser() {
		
		Scanner scnJulianNumber = new Scanner(System.in);
		final int julianNumber = scnJulianNumber.nextInt();
		
		JulianNumber julianObject = new JulianNumber(0,0,0);
		julianObject.setJulianDate(julianNumber);
		System.out.println("The Gregorian Date is: " + julianObject.toDate() +"\n");
	}
        
        /* This method gets a Gregorian date input by the user 
            and converts it to a Julian Number.
            It requests the year, month, and day as 3 separate inputs.
            It then prints out the Julian Number.
            This method checks to make sure the month the user inputs is not greater than 12.
            This method checks to make sure the day the user inputs is not greater than 31.
        */
	private static void getDateFromUser() {
		
		System.out.println("Enter Year");
		Scanner scnYear = new Scanner(System.in);
		final int year = scnYear.nextInt();
		
		System.out.println("Enter Month (As a number 1-12)");
		Scanner scnMonth = new Scanner(System.in);
		 int month = scnMonth.nextInt();
		 if (month > 12) {
                        System.out.println("Month can not be greater than 12. Please re-enter the "
                                + "month.");
                        month = scnMonth.nextInt();
                    }
		
		
		System.out.println("Enter Day (As a number 1-31)");
		Scanner scnday = new Scanner(System.in);
	    int day = scnday.nextInt();
		if (day > 31) {
            System.out.println("Date can not be greater than 31. Please re-enter the date.");
            day = scnday.nextInt();
            }
		
		JulianNumber julianObject = new JulianNumber(year, month, day);
		System.out.println("Julian Number is: " + julianObject.getJulianDate()+"\n");
		
	}
}
