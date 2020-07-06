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
public class Manager extends Employee{
//
//    public Manager(String string, double d) {
//        super(string, d);
//    }
    public Manager(String name, double salary) {
		super(name, salary);
		bonus = salary * bonus / 100;
	}
//    public void raiseSalary(double byPercent); 
    public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}
	

	private double bonus;
    
}
