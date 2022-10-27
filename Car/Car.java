public class Car {
    public String make;
    public String model;
    public int year;
    public double MPG;
    public double milesDriven;
    public double fuelCapacity;
    public double fuelRemaining;

    public Car(String make,
            String model,
            int year,
            double MPG,
            double milesDriven,
            double fuelCapacity,
            double fuelRemaining) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.MPG = MPG;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;
    }

    // fillTank(double g), which adds up to g gallons of gas to the fuel tank, but
    // not more than the car's fuel capacity.
    public void fillTank(double g) {
        if (g >= fuelCapacity) {
            fuelRemaining = fuelCapacity;
        } else {
            fuelRemaining += g;
        }
    }

    // drive(double m), which simulates driving m miles in the car, adding to the
    // total number of miles driven, and reducing the amount of gas in the car
    // according to this car's average MPG.
    public void drive(double m) {
        milesDriven += m;
        fuelRemaining -= (m / MPG);
    }

    // toString( ), which returns a String representation of the car.
    public String toString() {
        return "\nMake: " + make +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nMPG: " + MPG +
                "\nMiles Driven: " + milesDriven +
                "\nFuel Capacity: " + fuelCapacity +
                "\nFuel Remaining: " + fuelRemaining;
    }

    public double getFuelRemaining() {
        return fuelRemaining;
    }
}
