package org.howard.edu.lsp.oopfinal.question1;

import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        SongsDatabase db = new SongsDatabase();

        // Adding songs to the database
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        // Getting songs for a genre
        Set<String> rapSongs = db.getSongs("Rap");
        System.out.println("Rap Songs: " + rapSongs); // Should print [Savage]

        // Getting the genre of a song
        System.out.println("Genre of 'Savage': " + db.getGenreOfSong("Savage")); // Should print "Rap"
        System.out.println("Genre of 'Always There': " + db.getGenreOfSong("Always There")); // Should print "Jazz"
    }
}

