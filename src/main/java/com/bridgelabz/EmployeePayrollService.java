package com.bridgelabz;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {

    private static final String FILE_NAME = "payroll-file.txt";

    public List<EmployeePayrollData> readEmployeePayrollData() {

        List<EmployeePayrollData> list = new ArrayList<>();
        Path path = Paths.get(FILE_NAME);

        // ✅ Safe Check
        if (!Files.exists(path)) {
            System.out.println("File does not exist. Please run UC4 first.");
            return list;
        }

        try {
            Files.lines(path)
                    .forEach(line -> {
                        String[] parts = line.split(",");
                        list.add(new EmployeePayrollData(
                                Integer.parseInt(parts[0]),
                                parts[1],
                                Double.parseDouble(parts[2])
                        ));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {

        EmployeePayrollService service = new EmployeePayrollService();

        List<EmployeePayrollData> employees =
                service.readEmployeePayrollData();

        if (employees.isEmpty()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Employees read from file:");
            employees.forEach(System.out::println);
        }
    }
}