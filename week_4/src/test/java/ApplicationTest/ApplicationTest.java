package ApplicationTest;

import inheritance.Employee;
import inheritance.Manager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abhijeet
 */
public class ApplicationTest {

    @Test
    public void test() {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setSalary(100000);
        Manager manager = new Manager(emp.getName(), emp.getSalary());
        manager.setBonus(5);
        manager.raiseSalary(30);
        System.out.println("Employee's name is " + manager.getName());
        System.out.println("Employee's salary is " + manager.getSalary());
    }
}
