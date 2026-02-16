// Created a subclass 'Bike' extended from 'Vehicle' class
// This inherits common attributes and methods from its parent (Vehicle) class
public class Bike extends Vehicle{

    // Additional attribute unique to this class
    private int engineCapacityCC;

    // Parameterized constructor which initializes parent's attributes and also
    // the attribute unique to this class
    public Bike(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int engineCapacityCC
    ){
        // 'super' calls the 'Vehicle' constructor to set common fields
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        // Set the 'Bike' specific fields
        this.engineCapacityCC = engineCapacityCC;
    }

    // Getter method to fetch the engine capacity
    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    // Bike rental cost calculation using the abstract method
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getEngineCapacityCC() * 0.5 * days);
    }
}
