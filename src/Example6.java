class Example6 {
    private final long lowerBound;
    private final long upperBound;

    Example6(long lowerBound, long upperBound){
        if (lowerBound>upperBound){
            throw new IllegalArgumentException("lowerBound is bigger than upperBound");
        }
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    boolean isInRange(long number){
        return (number >= lowerBound && number <= upperBound);
    }
}
