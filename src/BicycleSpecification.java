class BicycleSpecification {

    enum BicycleType {
        RoadBike,
        MountainBike,
        Tandem,
    }

    private int accelerationSpeed;

    // add a variable for brakeSpeed
    int brakeSpeed;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType) {
        this.accelerationSpeed = accelerationSpeed;
        // initialize brakeSpeed private variable
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
        }
        // add getters for brakeSpeed
    public int getBrakeSpeed(){
        return brakeSpeed;
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }
}
