package org.howard.edu.lsp.midterm.question2;

public interface Range {
	// Returns true if v is ≥ lower bound and ≤ upper bound and false otherwise
    public boolean contains( int value ); 
    
    // Returns true if the receiver contains at least 
    // one value in common with other, and false otherwise
    public boolean overlaps( Range other );
    
    // // Returns the number of integers in the range
    public int size(); 
}

class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    @Override
    public boolean overlaps(Range other) {
        return (other.contains(lowerBound) || other.contains(upperBound)) ||
                (contains(((IntegerRange) other).lowerBound) || contains(((IntegerRange) other).upperBound));
    }

    @Override
    public int size() {
        return Math.abs(upperBound - lowerBound) + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }
}

