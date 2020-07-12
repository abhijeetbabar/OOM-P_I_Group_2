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
public class Manager extends Employee {

    private double bonus;
// Manager constructor

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = salary * bonus / 100;
    }

//    Get employee salary
    public double getSalary() {
        // no direct access to private variables of superclass
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
// Setting bonus for the employee

    public void setBonus(double b) {
        bonus = b * getSalary() / 100;
    }
}
