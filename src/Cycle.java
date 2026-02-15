public class Cycle extends Vehicle{

    private int gearCount;

    // Initialize Cycle details and pass common attributes to parent Vehicle class
    public Cycle(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int gearCount
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    // Calculate rental cost: Base rate per day + Flat fee for gears
    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRatePerDay() * days) + (getGearCount() * 150);
    }
}
