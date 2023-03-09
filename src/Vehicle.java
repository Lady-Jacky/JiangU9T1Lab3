public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;
  
  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }
  
  public double calculateTollPrice() {
    return tollFee * passengers;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int newPassengers) {
    passengers = newPassengers;
  }

  public void reduceTollFee() {
    tollFee *= 0.5;
  }

  public void honk() {
    System.out.println("HONK!!!");
  }
  public void printInfo() {
    System.out.println("-----------------------------------");
    System.out.println("License plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nNumber of Passengers: " +
            getPassengers());
  }
}