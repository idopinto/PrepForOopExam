package class_invariant;

public class HybridCar extends Car {
    // invariant: charge >= 0;
    private int charge;

    @Override
    // postcondition: speed < limit
    protected void accelerate() {
        // Accelerate HybridCar ensuring speed < limit
    }

    // Other methods...
}
