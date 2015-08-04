package com.darwinallen;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Check to make sure we've passed in a file name
        if (args.length == 0) {
            System.out.println("No file specified. Exiting.");
            return;
        }

        // Parse and sort the file
        GetAndSortWords(args[0]);

    }

    private static void GetAndSortWords(String arg) throws IOException {
        Parser parser = new Parser();
        String words = parser.GetWordsFromFile(arg);
        List<String> sortedWords = parser.OrganizeWords(words);

        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
