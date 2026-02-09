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

/*Bike(child) inherits all features from Vehicles(parent).Also bike has a unique attribute which is engineCapacityCC
,from VehicleID,brand, model,baseRatePerDay,availability,engineCapacityCC can create new bike object .
It sends the common data (ID, Brand, Model, etc.) up to the parent Vehicle class so the parent can handle it.
The Bike class doesn't need to save these manually because Vehicle does it.It is passed when you create
object but as private variable inside the class.From getter can get "What is the engine size of this bike?"
The parent class already has calculateRentalCost method but  need to replace special method for bikes.
It calculates the price differently than a normal Vehicle.When  calculate the bike bill,
it charges extra for bigger engines!


 */

