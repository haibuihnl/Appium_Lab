package Lab_10;

import java.util.Arrays;
import java.util.List;

public class Lab_10 {
    public static void main(String[] args) {
        int total = 0;
        Employee FTE1 = new FTE();
        Employee FTE2 = new FTE();
        Employee FTE3 = new FTE();

        Employee CT1 = new Contract();
        Employee CT2 = new Contract();

        List<Employee> employeeList = Arrays.asList(FTE1, FTE2, FTE3, CT1, CT2);
        for(Employee employee:employeeList){
            total = total + employee.getSalary();
        }
        System.out.println("The Salary is: "+ total);
    }
}
