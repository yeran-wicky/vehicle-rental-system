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
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Vehicle brand: "+brand);
        System.out.println("Vehicle model: "+model);
        System.out.println("Base rate per day: "+baseRatePerDay);
        System.out.println("Availability: "+isAvailable);
    }

    public void rentVehicle() {
        if (!isAvailable) {
            System.out.println("Vehicle is already rented");
        }else {
            isAvailable = false;
            System.out.println("Vehicle rented successfully");
        }
    }

    public void returnVehicle() {
        if (isAvailable) {
            System.out.println("Vehicle is currently available");
        }else {
            isAvailable = true;
            System.out.println("Vehicle returned successfully");
        }
    }

    public abstract double calculateRentalCost(int days);
}