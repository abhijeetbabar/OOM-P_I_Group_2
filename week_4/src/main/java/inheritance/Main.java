/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Group 2
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Welcome to the Employee Database ===");
        System.out.println("Enter N to add a new employee.");
        System.out.println("Enter Q to quit.");
        // getNameFromUser();
        while (true) {
            //creates scanner for user to input data
            Scanner scanner = new Scanner(System.in);
            // final int choice = scanner.nextInt();
            char ch = scanner.next().charAt(0);
            if (ch == 'q' || ch == 'Q') {
                System.out.println("Quiting....\n");
                System.exit(0);
            } else if (ch == 'n' || ch == 'N') {
                getData();
            } else {
                System.out.println("Please enter 'N' or 'Q' \n");
            }
        }
    } // Close PSVM

    private static void getData() {
        System.out.println("Please enter the employee's first name.");
        Scanner scnFirstName = new Scanner(System.in);
        String firstName = scnFirstName.nextLine();

        System.out.println("Please enter the employee's last name.");
        Scanner scnLastName = new Scanner(System.in);
        String lastName = scnLastName.nextLine();

        String fullName = firstName + " " + lastName;

        System.out.println("Please enter the employee's salary.");
        Scanner scnSalary = new Scanner(System.in);
        double salary = scnSalary.nextDouble();

        System.out.println("Please enter the employee's raise percentage.");
        Scanner scnPercentage = new Scanner(System.in);
        double raisePercentage = scnPercentage.nextDouble();

        System.out.println("Is the employee a manager (Y/N)? ");
        Scanner scnManager = new Scanner(System.in);
        char yn = scnManager.next().charAt(0);
        boolean isManager = false;
        if (yn == 'Y' || yn == 'y') {
            isManager = true;
        }

        System.out.println("Employee's name is: " + fullName);
        System.out.println("Employee's salary is: $ " + salary);
        System.out.println("Employee's percentage raise is: " + raisePercentage + " %");

        if (isManager) {
            Manager newManager = new Manager(fullName, salary);
            if (raisePercentage > 0) {
                newManager.raiseSalary(raisePercentage);
                newManager.setBonus(1);
                System.out.println("Manager's salary after the raise is: $ " + newManager.getSalary());
            }
        } else {
            Employee newEmployee = new Employee(fullName, salary);
            if (raisePercentage > 0) {
                newEmployee.raiseSalary(raisePercentage);
                System.out.println("Employee's salary after the raise is: $ " + newEmployee.getSalary());
            }
        }
        System.exit(0);
    }

    private static void getLastName() {
        Scanner scnLastName = new Scanner(System.in);
        String lastName = scnLastName.nextLine();
        System.out.println("Employee's last name is " + lastName);
    }

    private static void getSalary() {
        Scanner scnSalary = new Scanner(System.in);
        String salary = scnSalary.nextLine();
        System.out.println("Employee's salary is " + salary);
    }

    
    private static void getRaise() {
        Scanner scnRaise = new Scanner(System.in);
        String raise = scnRaise.nextLine();
        System.out.println("Employee's salary is " + raise);
    }

} // Close Main
