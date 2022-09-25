public class Plane {


    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }


    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity(){
         return planeType.getCapacity();
    }

    public double getWeightOfPlane(){
        return planeType.getWeight();
    }



}
