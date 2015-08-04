package com.darwinallen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Parser {

    // Returns a giant string with all lines from the file
    public String GetWordsFromFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        StringBuilder allTheWords = new StringBuilder();

        // Populate the grid list with grids from the sample file
        while ((line = reader.readLine()) != null) {

            allTheWords.append(line + " "); // Append a space to each line to prevent concatenated words
        }

        reader.close();
        return allTheWords.toString();
    }

    public List<String> OrganizeWords(String allTheWords) {

        allTheWords = allTheWords.toLowerCase(); // Convert words to lower case (readability / easier to find dupes)
        String[] words = allTheWords.split("[^a-z]+"); // Split giant string with anything not part of common words
        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(words)); // Throw words in a set to get rid of dupes
        List<String> sortedWords = new ArrayList<String>(uniqueWords); // Add the words to a list
        Collections.sort(sortedWords); // Sort the list

        return sortedWords;
    }
}
