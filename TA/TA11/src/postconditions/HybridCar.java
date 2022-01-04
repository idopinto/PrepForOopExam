package postconditions;

public class HybridCar extends Car {

    private int charge;
    // Some properties and other methods...

    @Override
    // postcondition: speed must reduce
    // postcondition: charge must increase
    protected void brake() {
       speed = speed - 1;
       charge = charge + 1;
    }
}
