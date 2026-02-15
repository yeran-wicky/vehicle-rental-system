public class Van extends Vehicle{

    // Specific property for Van - Cargo capacity in Kg
    private double cargoCapacityKg;

    // Initialize Van details and pass common attributes to parent Vehicle class
    public Van(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            double cargoCapacityKg
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        this.cargoCapacityKg = cargoCapacityKg;
    }

    public double getCargoCapacityKg() {
        return cargoCapacityKg;
    }

    // Calculate rental cost: Base rate + Extra charge based on cargo weight (0.2 per Kg per day)
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getCargoCapacityKg() * 0.2 * days);
    }
}
