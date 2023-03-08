public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut){
    if(numOut < getPassengers()) {
      setPassengers(getPassengers()-numOut);
      return true;
    } else {
      return false;
    }
  }


  public void applyDiscount() {
    if(!discountApplied && isElectric()) {
      reduceTollFee();
      discountApplied = true;
    }
  }
  public void setDiscountApplied() {
    discountApplied = true;
  }
  public void printCar() {
    System.out.println("-----------------------------------");
    System.out.println("License plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nNumber of Passengers: " +
            getPassengers() + "\nDiscount Applied: " + discountApplied + "\nIs Electric: " + electric);
  }

}