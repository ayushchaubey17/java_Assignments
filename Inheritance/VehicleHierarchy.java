// Base class
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + make + " " + model);
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

// Subclass Car
class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year); // Call the constructor of the superclass
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of Vehicle
        System.out.println("Number of doors: " + doors);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year); // Call the constructor of the superclass
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of Vehicle
        System.out.println("Payload capacity: " + payloadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year); // Call the constructor of the superclass
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of Vehicle
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test the hierarchy
public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2019, 2.5);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, false);

        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
    }
}
