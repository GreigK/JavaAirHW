public class Pilot extends Employee {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane(){
        return "We haven't crashed yet!";
    }
}
