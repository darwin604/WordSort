package com.darwinallen;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Parser parser = new Parser();
        String words = parser.GetWordsFromFile("input.dat");
        List<String> sortedWords = parser.OrganizeWords(words);

        for (String word : sortedWords) {
            System.out.println(word);
        }

    }
}
