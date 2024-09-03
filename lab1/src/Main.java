abstract class Vehicle {
    private String combustion;
    private int numberOfSeats;

    public Vehicle(String licensePlate, int numberOfSeats) {
        this.combustion = combustion;
        this.numberOfSeats = numberOfSeats;
    }

    public String getCombustionPlate() {
        return combustion;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
class ElectricVehicle extends Vehicle {
    private int batteryLevel;

    public ElectricVehicle(String licensePlate, int numberOfSeats, int batteryLevel) {
        super(licensePlate, numberOfSeats);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
class internCombustion extends Vehicle {
   private int gasLevel;

    public internCombustion(String combustion, int numberOfSeats, int batteryLevel) {
        super(combustion, numberOfSeats);
        this.gasLevel = gasLevel;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

}
abstract class PassengerTransportation {
    private ArrayList<Passenger> passengers;
    private Driver driver;
    private Vehicle vehicle;

    public PassengerTransportation(Driver driver, Vehicle vehicle) {
        this.driver = driver;
        this.vehicle = vehicle;
        this.passengers = new ArrayList<>();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        this.passengers.remove(passenger);
    }
}

public static void main()
{
#}




