package com.bridgelabz;

import java.util.*;

public class EmployeePayrollService {

    private List<EmployeePayrollData> employeeList = new ArrayList<>();

    public void readEmployeePayrollData(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = scanner.next();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        employeeList.add(new EmployeePayrollData(id, name, salary));
    }

    public void writeEmployeePayrollData() {
        System.out.println("Writing Employee Payroll to Console:");
        employeeList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeePayrollService service = new EmployeePayrollService();
        service.readEmployeePayrollData(scanner);
        service.writeEmployeePayrollData();
    }
}