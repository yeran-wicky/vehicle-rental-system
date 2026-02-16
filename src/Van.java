// Created a subclass 'Van' extended from 'Vehicle' class
// This inherits common attributes and methods from its parent (Vehicle)
public class Van extends Vehicle{

    // Additional attribute unique to this class
    private double cargoCapacityKg;

    // Parameterized constructor which initializes parent's attributes and
    // the attribute unique to this class
    public Van(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            double cargoCapacityKg
    ){
        // 'super' calls the 'Vehicle' constructor to set common fields
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        // Set the 'Van' specific fields
        this.cargoCapacityKg = cargoCapacityKg;
    }

    // Getter method to fetch the cargo capacity
    public double getCargoCapacityKg() {
        return cargoCapacityKg;
    }

    // Van rental cost calculation using the abstract method
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getCargoCapacityKg() * 0.2 * days);
    }
}
