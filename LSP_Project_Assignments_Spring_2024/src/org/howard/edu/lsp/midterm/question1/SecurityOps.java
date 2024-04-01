package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
	public static String encrypt(String text) {
        // Initialize two StringBuilder objects for even and odd characters
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Remove whitespace and punctuation from the text
        String cleanedText = text.replaceAll("\\s+", "").replaceAll("\\p{Punct}", "");

        // Iterate through each character of the cleaned text
        for (int i = 0; i < cleanedText.length(); i++) {
            char ch = cleanedText.charAt(i);
            // Append even-indexed characters to evenChars StringBuilder
            if (i % 2 == 0) {
                evenChars.append(ch);
            }
            // Append odd-indexed characters to oddChars StringBuilder
            else {
                oddChars.append(ch);
            }
        }

        // Concatenate evenChars and oddChars and return the result
        return evenChars.toString() + oddChars.toString();
    }
}
