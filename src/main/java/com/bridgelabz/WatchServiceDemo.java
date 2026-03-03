package com.bridgelabz;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceDemo {

    public static void main(String[] args) throws IOException, InterruptedException {

        Path path = Paths.get("TempDirectory");
        Files.createDirectories(path);

        WatchService watchService = FileSystems.getDefault().newWatchService();

        path.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        System.out.println("Watching Directory...");

        while (true) {
            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event: " + event.kind()
                        + " File: " + event.context());
            }

            key.reset();
        }
    }
}