/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Kay
 */
import java.util.Scanner;

public class Main {
     
private static class employee {

        private static String getLastName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
//IDE came up with this code suggestion

        private static String getFirstName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static String getSalary() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public employee() {
        }
             
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Database");
        
                         
        getNameFromUser();
        while (true) {
            System.out.println("Please enter your choice\n"
                    + "\n 1. Get last name"
                    + "\n 2. Get first name"
                    + "\n 3. Get salary"
                    + "\n 4. Quit"); 
                            
           //creates scanner for user to input data
            Scanner scanner = new Scanner(System.in);
            final int choice = scanner.nextInt();
            
            
            switch (choice) {
                case 1:
                    System.out.println("Please enter first name\n");
                    System.out.println("First Name: " + employee.getFirstName() + "\n");
                    break;
                case 2:
                    System.out.println("Get last name\n)");
                    System.out.println("Last Name: " + employee.getLastName() + "\n");
                    break;
                case 3: 
                    System.out.println("Get salary\n");
                    System.out.println("Salary: " + employee.getSalary() + "\n");
                case 4:
                    System.out.println("Quiting....\n");
                    System.exit(0);
                    break;
               
                default:
                    System.out.println("Error: Invalid Employee name. Please enter a new name. \n");
            }
                   
        }
    }

    private static void getNameFromUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
}
