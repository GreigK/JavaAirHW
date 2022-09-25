public class Employee {

    private String name;
    private Rank rank;
    // passed in Rank from Rank.java
    //passes into anything that supers Employee
    public Employee(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

}
