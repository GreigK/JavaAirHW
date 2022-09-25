public class CabinCrewMember extends Employee {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String sendMessage(){
        return "Strap up it might be a bumpy ride";
    }


}
