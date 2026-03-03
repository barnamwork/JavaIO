package com.bridgelabz;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {

    private List<EmployeePayrollData> employeeList;
    private static final String FILE_NAME = "payroll-file.txt";

    public EmployeePayrollService(List<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }

    public void writeEmployeePayrollData() {
        StringBuilder builder = new StringBuilder();

        employeeList.forEach(emp ->
                builder.append(emp.toString()).append("\n"));

        try {
            Files.write(Paths.get(FILE_NAME),
                    builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        try {
            Files.lines(Paths.get(FILE_NAME))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long countEntries() {
        try {
            return Files.lines(Paths.get(FILE_NAME)).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {

        List<EmployeePayrollData> list = new ArrayList<>();
        list.add(new EmployeePayrollData(1, "Jeff", 100000));
        list.add(new EmployeePayrollData(2, "Bill", 200000));
        list.add(new EmployeePayrollData(3, "Mark", 300000));

        EmployeePayrollService service =
                new EmployeePayrollService(list);

        service.writeEmployeePayrollData();
        service.printData();

        System.out.println("Entries Count: "
                + service.countEntries());
    }
}

