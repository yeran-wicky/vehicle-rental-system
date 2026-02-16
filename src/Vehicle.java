// Create an abstract class 'Vehicle'
// Sub classes 'Car', 'Bike', 'Van', Cycle are extended from this class
public abstract class Vehicle {

    // Common attributes
    private String vehicleId;
    private String brand;
    private String model;
    private double baseRatePerDay;
    private boolean isAvailable;

    // Parameterized constructor to initialize vehicle objects
    public Vehicle(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable
    ){
        // points to the current object using 'this'
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.baseRatePerDay = baseRatePerDay;
        this.isAvailable = isAvailable;
    }

    // Getter and setter methods to access private variables (Encapsulation)
    // Getter method to fetch vehicle id
    public String getVehicleId() {
        return vehicleId;
    }

    // Getter method to fetch brand
    public String getBrand() {
        return brand;
    }

    // Getter method to fetch model
    public String getModel() {
        return model;
    }

    // Getter method to fetch base rate per day
    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    // Getter method to fetch availability
    public boolean getIsAvailable() {
        return isAvailable;
    }

    // Setter method to set availability
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Prints vehicle details using displayDetails() function
    // Subclasses can access this function without rewriting code in each subclass
    public void displayDetails() {
        System.out.println("Vehicle ID: "+getVehicleId());
        System.out.println("Vehicle brand: "+getBrand());
        System.out.println("Vehicle model: "+getModel());
        System.out.println("Base rate per day: "+getBaseRatePerDay());
        System.out.println("Availability: "+getIsAvailable());
    }

    // Function to check availability and set availability when renting
    public void rentVehicle() {
        if (!getIsAvailable()) {
            System.out.println("\nVehicle is already rented");
        }else {
            setIsAvailable(false);
            System.out.println("\nVehicle rented successfully");
        }
    }

    // Function to check availability and set availability when returning
    public void returnVehicle() {
        if (getIsAvailable()) {
            System.out.println("\nThis vehicle is already available");
        }else {
            setIsAvailable(true);
            System.out.println("\nVehicle returned successfully");
        }
    }

    // Abstract method use to calculate rental cost based on each logic implemented in each subclass
    public abstract double calculateRentalCost(int days);
}