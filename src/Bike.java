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
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable); //Parent Constructors
        this.engineCapacityCC = engineCapacityCC;
    }

    //Getter method
    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    // Use abstract method to calculate bike rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getEngineCapacityCC() * 0.5 * days);
    }
}
