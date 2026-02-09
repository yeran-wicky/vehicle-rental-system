public class Van extends Vehicle{

    private double cargoCapacityKg;

    // Constructors
    public Van(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            double cargoCapacityKg
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);// Parent Constructors
        this.cargoCapacityKg = cargoCapacityKg;
    }

    // Getter Method
    public double getCargoCapacityKg() {
        return cargoCapacityKg;
    }

    // Use abstract method to calculate van rental cost
    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getCargoCapacityKg() * 0.2 * days);
    }
}
