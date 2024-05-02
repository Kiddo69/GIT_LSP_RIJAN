package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class SongsDatabaseTest {

    @Test
    void testAddSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    @Test
    void testGetGenreOfSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    @Test
    void testGetGenreOfNonexistentSong() {
        SongsDatabase db = new SongsDatabase();
        assertNull(db.getGenreOfSong("Nonexistent Song"));
    }

    @Test
    void testGetSongs() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        assertEquals(Set.of("Savage", "Gin and Juice"), db.getSongs("Rap"));
    }

    @Test
    void testGetSongsOfNonexistentGenre() {
        SongsDatabase db = new SongsDatabase();
        assertEquals(0, db.getSongs("Nonexistent Genre").size());
    }
}

