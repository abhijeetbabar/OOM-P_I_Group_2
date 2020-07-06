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

public class Employee {

//    private String firstName;
//    private String lastName;
    private String name;

//    private double[] salary = new double [10]; 
    private double salary;
//    private String lname;
//    private String fname;
//    int c; 
    // objects should be created inside a main method
//    c = inputData (salary); //calling input method
//    raise (salary, c);
//    output (salary, raiseSalary);

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

//public Employee(String firstName, String lastName){
//     this.firstName =  fname;
//     this.lastName = lname;
//     int c = 0;
//}
// Scanner scanner = new Scanner(System.in);
//public String getFirstName(){
//    return this.fname;
//}
//public String getLastName(){
//    return this.lname;
//
//    public double getSalary() {
//        return salary;
//    }
//public double getSalary(){ ///how to fix?
//    return this.salary; 
//}
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
//public static void output (double[] salary, double[] raiseSalary){
//    System.out.printf("salary", "raiseSalary");
//    for (int i = 0; i < salary.length; i++);
//    
//    System.out.printf("%30s %30s \n", salary[i], raiseSalary[i]);
//        
//     return;
//}
}

//}
//}

