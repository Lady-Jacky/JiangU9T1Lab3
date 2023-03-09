public class VehicleRunner {
  public static void main(String[] args) {

    Vehicle vehicle1 = new Vehicle("BMW", 10.0, 5);
    vehicle1.honk();
    Car myCar3 = new Car("MK4567", 6.75, 4, true);
    myCar3.honk();
    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.honk();
    Taxi taxi1 = new Taxi("Flying Car", 25, 10, true, 100);
    taxi1.honk();

  }
}