package de.quinscape;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SourceCodeDownloader {

    public void startApplication()throws IOException{
        downloadSourceCode();
    }

    private void downloadSourceCode() throws IOException {
        Path path = Paths.get("sourceCode.html");
        if (!Files.exists(path)){
            printBuffering();
            URL url = new URL( "https://www.quinscape.de/" );
            Files.copy(url.openStream(), Paths.get("sourceCode.html"));
            printInformation();
        } else {
            System.out.println("File already exists. Please check your directory!");
        }
    }

    private void printInformation(){
        System.out.println("Source code successfully downloaded!");
    }

    private void printBuffering(){
        System.out.println("DOWNLOADING SOURCE CODE...");
    }







}
