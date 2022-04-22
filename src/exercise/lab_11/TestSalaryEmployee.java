package exercise.lab_11;

import java.util.ArrayList;
import java.util.List;

public class TestSalaryEmployee {
    int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        if (employeeList.isEmpty()){
            System.out.println("There are no employees in the list");
        }else {
            for (Employee employee : employeeList) {
                totalSalary = totalSalary + employee.salaryOfEmployee();
            }
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        int totalSalary;
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee());
        employees.add(new ContractEmployee());
        employees.add(new FullTimeEmployee());
        employees.add(new FullTimeEmployee());
        employees.add(new FullTimeEmployee());

        totalSalary = new TestSalaryEmployee().getTotalSalary(employees);
        System.out.println(totalSalary);
    }
}
