public class Cycle extends Vehicle{

    private int gearCount;

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

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getGearCount() * 0.4 * days);
    }
}
