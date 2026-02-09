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
            //create new cycle object
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        /*common data (ID, Brand, Model, etc.) up to the parent Vehicle class so the parent can handle it.
        The cycle class doesn't need to save these manually because Vehicle does it.*/
        this.gearCount = gearCount;
        //gear count you gave when creating the cycle and saves it into the private variable inside this class.
    }

    public int getGearCount() {
        return gearCount;
    }
    //getter

    @Override
    public double calculateRentalCost(int days) {
        return (getBaseRatePerDay() * days) + (getGearCount() * 150);
    }
    //calculate the cost
}
