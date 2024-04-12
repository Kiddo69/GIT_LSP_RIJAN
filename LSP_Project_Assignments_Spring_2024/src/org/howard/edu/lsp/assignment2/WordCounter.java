package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        // Specify the file path
    	String workingDir = System.getProperty("user.dir");
        String filePath = workingDir+"/src/org/howard/edu/lsp/assignment2/words.txt";

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        try {
            // Create a BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read each line from the file
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using spaces as delimiters
                String[] words = line.split("\\s+");

                // Iterate through the words
                for (String word : words) {
                    // Remove punctuation and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z']", "").toLowerCase();

                    // Ignore trivial words
                    if (word.length() > 3) {
                        // Update word count in the map
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Close the reader
            reader.close();

            // Print the word counts
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
	
