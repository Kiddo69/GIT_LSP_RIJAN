package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set;

    // Default Constructor
    public IntegerSet() {
        this.set = new ArrayList<Integer>();
    }

    // Constructor if you want to pass in already initialized
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /*
     * Returns true if the 2 sets are equal, false otherwise; Two sets are equal if
     * they contain all of the same values in ANY order. This overrides the equal
     * method from the Object class.
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) o;
        return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set
    // is empty
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Adds an item to the set or does nothing if already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    // Set intersection, all elements in s1 and s2
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<Integer>();
        for (int item : set) {
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        set = intersection;
    }

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.remove(item);
        }
    }

    public void complement(IntegerSet universe) throws IntegerSetException {
        for (int i = universe.smallest(); i <= universe.largest(); i++) {
            if (!this.contains(i)) {
                this.add(i);
            } else {
                this.remove(i);
            }
        }
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. This overrides the equal method
    // from the Object class.
    @Override
    public String toString() {
        return set.toString();
    } // return String representation of your set
}
