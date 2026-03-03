package com.bridgelabz;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileOperationsDemo {

    public static void main(String[] args) throws IOException {

        Path dirPath = Paths.get("TempDirectory");

        // Check File Exists
        System.out.println("Directory Exists: " + Files.exists(dirPath));

        // Create Directory
        Files.createDirectories(dirPath);
        System.out.println("Directory Created");

        // Create File
        Path filePath = Paths.get("TempDirectory/sample.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
            System.out.println("File Created");
        }

        // List Files
        System.out.println("Listing Files:");
        Stream<Path> paths = Files.list(dirPath);
        paths.forEach(System.out::println);

        // Delete File
        Files.deleteIfExists(filePath);
        System.out.println("File Deleted: " + !Files.exists(filePath));
    }
}