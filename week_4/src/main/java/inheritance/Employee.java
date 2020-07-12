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
public class Employee {

    private String name;
    private double salary;
    
// Creates employee instance 
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
// Gets name of the employee
    public String getName() {
        return name;
    }
    
// Gets salary of the employee
    public double getSalary() {
        return salary;
    }
    
// Raises salary by given percentage
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
