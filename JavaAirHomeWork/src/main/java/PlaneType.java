public enum PlaneType {
    BOEING747( 467, 183500),
    CONCORDE(100, 78700),
    SR17(2, 170000);

    private final int capacity;
    private final double weight;

    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
