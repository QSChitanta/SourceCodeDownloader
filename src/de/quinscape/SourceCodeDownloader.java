package de.quinscape;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class SourceCodeDownloader {

    public void downloadSourceCode(String urlString) throws IOException {
        String filename = buildRandomFilename();
        fileExist(filename);
        printBuffering();
        URL url = new URL(urlString);
        Files.copy(url.openStream(), Paths.get(filename));
        printInformation();
    }

    private String buildRandomFilename(){
        UUID uuid = UUID.randomUUID();
        return uuid + ".html";
    }

    private void fileExist(String filename) throws IOException {
        Path path = Paths.get(filename);
        if (Files.exists(path)) {
            Files.delete(path);
        }
    }

    private void printInformation() {
        System.out.println("Source code successfully downloaded!");
    }

    private void printBuffering() {
        System.out.println("DOWNLOADING SOURCE CODE...");
    }


}
