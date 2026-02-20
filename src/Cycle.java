// Created a subclass 'Cycle' extended from 'Vehicle' class
// This inherits common attributes and methods from its parent (Vehicle)
public class Cycle extends Vehicle{

    // Additional attribute unique to this class
    private int gearCount;

    // Parameterized constructor which initializes parent's attributes and also
    // the attribute unique this class
    public Cycle(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int gearCount
    ){
        // 'super' calls the 'Vehicle' constructor to set common fields
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        // Set the 'Cycle' specific fields
        this.gearCount = gearCount;
    }

    // Getter methods to fetch the gear count
    public int getGearCount() {
        return gearCount;
    }

    // Cycle rental cost calculation using the abstract method
    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRatePerDay() * days) + (getGearCount() * 150);
    }
}