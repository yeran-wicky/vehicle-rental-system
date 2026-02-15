public abstract class Vehicle {
    // Encapsulated fields to store common vehicle details
    private String vehicleId;
    private String brand;
    private String model;
    private double baseRatePerDay;
    private boolean isAvailable;

    // Constructor to initialize the common attributes
    public Vehicle(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable
    ){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.baseRatePerDay = baseRatePerDay;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters for accessing and modifying private fields
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBaseRatePerDay(double baseRatePerDay) {
        this.baseRatePerDay = baseRatePerDay;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Vehicle brand: "+brand);
        System.out.println("Vehicle model: "+model);
        System.out.println("Base rate per day: "+baseRatePerDay);
        System.out.println("Availability: "+isAvailable);
    }

    // Handle renting - Check if available then mark as rented
    public void rentVehicle() {
        if (!isAvailable) {
            System.out.println("\nVehicle is already rented");
        }else {
            isAvailable = false;
            System.out.println("\nVehicle rented successfully");
        }
    }

    // Handle returning: Mark the vehicle as available again
    public void returnVehicle() {
        if (isAvailable) {
            System.out.println("\nThis vehicle is already available");
        }else {
            isAvailable = true;
            System.out.println("\nVehicle returned successfully");
        }
    }

    // Abstract method: Forces subclasses to define their own cost calculation
    public abstract double calculateRentalCost(int days);
}