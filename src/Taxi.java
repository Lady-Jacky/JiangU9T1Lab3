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

    public void printTaxi() {
        System.out.println("-----------------------------------");
        printCar();
        System.out.println("Total Fare Collected: " + fareCollected);

    }
}
