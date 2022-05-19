package Lab_8;

import java.util.ArrayList;
import java.util.List;

public class Lab_8_1 {
    public static void main(String[] args){
        int totalSalary = 0;
        Employee FTE1 = new FullTimeEmployee();
        Employee FTE2 = new FullTimeEmployee();
        Employee FTE3 = new FullTimeEmployee();

        Employee CT1 = new ContractEmployee();
        Employee CT2 = new ContractEmployee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(FTE1);
        employeeList.add(FTE2);
        employeeList.add(FTE3);
        employeeList.add(CT1);
        employeeList.add(CT2);

        for(Employee list:employeeList){
            totalSalary = totalSalary + list.getSalary();
        }
        System.out.println("Total salary is: " + totalSalary);
    }
}

