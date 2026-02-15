public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private double baseRatePerDay;
    private boolean isAvailable;

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

    public void displayDetails() {
        System.out.println("Vehicle ID: "+getVehicleId());
        System.out.println("Vehicle brand: "+getBrand());
        System.out.println("Vehicle model: "+getModel());
        System.out.println("Base rate per day: "+getBaseRatePerDay());
        System.out.println("Availability: "+getIsAvailable());
    }

    public void rentVehicle() {
        if (!getIsAvailable()) {
            System.out.println("\nVehicle is already rented");
        }else {
            setIsAvailable(false);
            System.out.println("\nVehicle rented successfully");
        }
    }

    public void returnVehicle() {
        if (getIsAvailable()) {
            System.out.println("\nThis vehicle is already available");
        }else {
            setIsAvailable(true);
            System.out.println("\nVehicle returned successfully");
        }
    }

    public abstract double calculateRentalCost(int days);
}