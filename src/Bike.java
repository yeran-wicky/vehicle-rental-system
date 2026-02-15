public class Bike extends Vehicle{

    private int engineCapacityCC;

    // Constructors
    public Bike(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int engineCapacityCC
    ) { // Calls the constructor of the parent class (Vehicle) to set common attributes
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        // Initialize the bike specific attribute
        this.engineCapacityCC = engineCapacityCC;
    }

    // Getter method to retrieve engine capacity
    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    // Calculate rental cost: Base rate + Extra charge based on engine CC
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getEngineCapacityCC() * 0.5 * days);
    }
}
