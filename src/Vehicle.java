public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private double baseRatePerDay;
    private boolean isAvailable;
    // Create parameterized Constructors
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
    //Use getter and setter method for encapsulation
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
    // Display Details
    public void displayDetails() {
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Vehicle brand: "+brand);
        System.out.println("Vehicle model: "+model);
        System.out.println("Base rate per day: "+baseRatePerDay);
        System.out.println("Availability: "+isAvailable);
    }
    // Rent and Return vehicles by using if
    public void rentVehicle() {
        if (!isAvailable) {
            System.out.println("\nVehicle is already rented");
        }else {
            isAvailable = false;
            System.out.println("\nVehicle rented successfully");
        }
    }

    public void returnVehicle() {
        if (isAvailable) {
            System.out.println("\nThis vehicle is already available");
        }else {
            isAvailable = true;
            System.out.println("\nVehicle returned successfully");
        }
    }
    // Use "abstract" to reuse the code
    public abstract double calculateRentalCost(int days);
}