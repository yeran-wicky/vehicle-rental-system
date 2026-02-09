public class Bike extends Vehicle{
    //Bike(child) inherits all features from Vehicles(parent).

    private int engineCapacityCC;
    //bike has a unique attribute which is engineCapacityCC


    public Bike(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int engineCapacityCC
            //create new bike object
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        /*common data (ID, Brand, Model, etc.) up to the parent Vehicle class so the parent can handle it.
        The Bike class doesn't need to save these manually because Vehicle does it.*/
        this.engineCapacityCC = engineCapacityCC;
        //engineCapacityCC you gave when creating the bike and saves it into the private variable inside this class.


    }

    public int getEngineCapacityCC() {
        return engineCapacityCC;
        //getter
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getEngineCapacityCC() * 0.5 * days);
        //Calculat the Cost
    }
}



