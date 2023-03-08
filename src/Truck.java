public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate() {
    if(hasTrailer) {
      if(axles > 4) {
        return getLicensePlate().endsWith("MX");
      } else {
        return getLicensePlate().endsWith("LX");
      }
    } else {
      return true;
    }
  }


  public void printTruck() {
    System.out.println("-----------------------------------");
    System.out.println("License plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nNumber of Passengers: " +
            getPassengers() + "\nnumber of Axles: " + axles + "\nHas Trailer: " + hasTrailer);

  }
}