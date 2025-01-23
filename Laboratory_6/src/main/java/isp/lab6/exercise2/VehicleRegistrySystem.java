package isp.lab6.exercise2;
import java.util.HashSet;
public class VehicleRegistrySystem {

    // HashSet to store Vehicle  objects
    private HashSet<Vehicle> vehicles;

    // Constructor
    public VehicleRegistrySystem() {
        vehicles = new HashSet<Vehicle>();
    }

    // Method to add a new Vehicle object to the HashSet
    public void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("Vehicle added to registry.");
        } else {
            System.out.println("Vehicle with VIN " + vehicle.getVin() + " already exists in registry.");
        }
    }

    // Method to remove a Vehicle object from the HashSet
    public void removeVehicle(String vin) {
        Vehicle vehicle = new Vehicle("1HGBH41JXMN109186", null, null, null, 0);
        if (vehicles.remove(vehicle)) {
            System.out.println("Vehicle with VIN " + vin + " removed from registry.");
        } else {
            System.out.println("Vehicle with VIN " + vin + " not found in registry.");
        }
    }
    public boolean containsVehicle(String vin) {
        Vehicle vehicle = new Vehicle(vin, null, null, null, 0);
        return vehicles.contains(vehicle);
    }
    // Method to display all Vehicle objects in the HashSet
    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("All vehicles:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.toString());
            }
        }
    }
    // Method to check if a vehicle with a given VIN is in the HashSet
    public void searchVehicle(String vin) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVin().equals(vin)) {
                System.out.println("Vehicle found in HashSet:");
                System.out.println(vehicle.toString());
                return;
            }
        }
        System.out.println("Vehicle with VIN " + vin + " not found in HashSet.");
    }

}
