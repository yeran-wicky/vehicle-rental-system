public class Cycle extends Vehicle{
    //Cycle(child) inherits all features from Vehicles(parent).

    private int gearCount;
    //Cycle has a unique attribute which is gear count

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
        return (getBaseRatePerDay() * days) + (getGearCount() * 150);
    }
}
