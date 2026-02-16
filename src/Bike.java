public class Bike extends Vehicle{

    private int engineCapacityCC;

    public Bike(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int engineCapacityCC
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        this.engineCapacityCC = engineCapacityCC;
    }

    public int getEngineCapacityCC() {
        return engineCapacityCC;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getEngineCapacityCC() * 0.5 * days);
    }
}
