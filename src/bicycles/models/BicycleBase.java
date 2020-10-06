package bicycles.models;

abstract class BicycleBase implements Bicycle {
    private int speed;
    protected void changeSpeed(int integer) {
        speed += integer;
    }
}
