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
        StringBuilder allTheWords = new StringBuilder(); // Big string to store all the raw input

        while ((line = reader.readLine()) != null) {

            allTheWords.append(line).append(" "); // Append a space to each line to prevent concatenated words
        }

        reader.close();
        return allTheWords.toString();
    }

    // Removes duplicate words, converts words to lower case, and returns them in a sorted list
    public List<String> OrganizeWords(String allTheWords) {

        allTheWords = allTheWords.toLowerCase(); // Convert words to lower case (readability / easier to find dupes)
        String[] words = allTheWords.split("[^a-z]+"); // Split giant string at any non-lowercase-alpha character
        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(words)); // Throw words in a set to get rid of dupes
        List<String> sortedWords = new ArrayList<String>(uniqueWords); // Add the words to a list
        Collections.sort(sortedWords); // Sort the list

        return sortedWords;
    }
}
