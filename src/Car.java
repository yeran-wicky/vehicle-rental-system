public class Car extends Vehicle {
    //Car(child) inherits all features from Vehicles(parent).

    private int numberOfSeats;
    //Car has a unique attribute which is numberOfSeats

    public Car(
            String vehicleId,
            String brand,
            String model,
            double baseRatePerDay,
            boolean isAvailable,
            int numberOfSeats
            //create new car object
    ){
        super(vehicleId, brand, model, baseRatePerDay, isAvailable);
        /*common data (ID, Brand, Model, etc.) up to the parent Vehicle class so the parent can handle it.
        The Car class doesn't need to save these manually because Vehicle does it.*/
        this.numberOfSeats = numberOfSeats;
        //numberOfSeats you gave when creating the car and saves it into the private variable inside this class.
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    //getter

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRatePerDay() * days + (getNumberOfSeats() * 200 * days);
        //Calculate the cost
    }
}