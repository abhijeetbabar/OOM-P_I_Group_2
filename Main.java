import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Julian Number to date application");
		
		while (true) {
			System.out.println("Enter your choice\n 1. Gregorian Date to Julian Number \n 2. Julian Number to Gregorian Date \n 3. Quit \n");
			
			Scanner scanner = new Scanner(System.in);
			final int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter a Gregorian Date \n");
				getDateFromUser();
				break;
			case 2:
				System.out.println("Enter a Julian Number \n");
				getNumberFromUser();
				break;
			case 3:
				System.out.println("Quiting... \n");
				System.exit(0);
				break;
			default:
				System.out.println("Error: Invalid Data!!, Try again \n");
			}
	}

	}

	private static void getNumberFromUser() {
		
		// System.out.println("Enter a Julian Number");
		Scanner scnJulianNumber = new Scanner(System.in);
		final int julianNumber = scnJulianNumber.nextInt();
		
		JulianNumber julianObject = new JulianNumber(0,0,0);
		julianObject.setJulianDate(julianNumber);
		System.out.println("The Gregorian Date is: " + julianObject.toDate() +"\n");
	}

	private static void getDateFromUser() {
		
		System.out.println("Enter Year");
		Scanner scnYear = new Scanner(System.in);
		final int year = scnYear.nextInt();
		
		System.out.println("Enter Month (As a number 1-12)");
		Scanner scnMonth = new Scanner(System.in);
		 int month = scnMonth.nextInt();
		 if (month > 12) {
                        System.out.println("Month can not be greater than 12. Please re-enter the month.");
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
