package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class IntegerSetTest {
    private IntegerSet set;

    @BeforeEach
    public void setUp() {
        set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(3);
        assertTrue(set.equals(otherSet));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(set.contains(2));
        assertFalse(set.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        assertEquals(3, set.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set.add(4);
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set.remove(2);
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(3);
        otherSet.add(4);
        set.union(otherSet);
        assertTrue(set.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(3);
        otherSet.add(4);
        set.intersect(otherSet);
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet otherSet = new IntegerSet();
        otherSet.add(2);
        otherSet.add(3);
        set.diff(otherSet);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set.complement(set);
        assertFalse(set.contains(1));
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertFalse(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", set.toString());
    }
}

