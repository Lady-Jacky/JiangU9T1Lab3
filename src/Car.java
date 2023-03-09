public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;

  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  @Override
  public double calculateTollPrice() {
    if (getPassengers() < 4) {
      return super.calculateTollPrice();
    } else {
      return getTollFee() * 4;
    }
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut < getPassengers()) {
      setPassengers(getPassengers() - numOut);
      return true;
    } else {
      return false;
    }
  }


  public void applyDiscount() {
    if (!discountApplied && isElectric()) {
      reduceTollFee();
      discountApplied = true;
    }
  }

  public void setDiscountApplied() {
    discountApplied = true;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Is Electric: " + isElectric() + "\nDiscount Applied: " + discountApplied);

  }
}