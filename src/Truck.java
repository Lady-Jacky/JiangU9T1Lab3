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

  @Override
  public double calculateTollPrice() {
    double totalToll = axles * getTollFee();
    if(hasTrailer) {
      totalToll*=2;
    }
    return totalToll;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Number of axles: " + axles + "\nHas Trailer: " + hasTrailer);
  }
}