public class Taxi extends Car{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return  fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        if(getPassengers() >= 4 && !isDiscountApplied()) {
            reduceTollFee();
            setDiscountApplied();
        }
        fareCollected+= numRiders * farePerRider;
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider *= (getPassengers() - 1);
        return dropOffPassengers(getPassengers()-1);
    }

    @Override
    public void honk() {
        System.out.println("I will fly instead");
    }
}
