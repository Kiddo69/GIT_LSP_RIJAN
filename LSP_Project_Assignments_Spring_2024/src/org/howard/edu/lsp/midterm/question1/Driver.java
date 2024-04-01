package org.howard.edu.lsp.midterm.question1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = "I love CSCI363";
        // Encrypt the input text
        String encryptedText = SecurityOps.encrypt(inputText);
        // Display the encrypted text
        System.out.println("Encrypted Text: " + encryptedText);
	}

}