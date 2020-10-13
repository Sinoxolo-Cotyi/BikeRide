package bicycles.models;

abstract class BicycleBase implements Bicycle {
    protected int speed;
    protected void changeSpeed(int integer) {
        speed += integer;
    }
}
