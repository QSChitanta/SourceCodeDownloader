package de.quinscape;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SourceCodeDownloader scd = new SourceCodeDownloader();
        if (args.length > 0){
            scd.downloadSourceCode(args[0]);
        } else {
            System.out.println("Please provide an url address.");
        }
    }
}