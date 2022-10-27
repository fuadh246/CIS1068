public class CarMain {
    public static void main(String[] args) {
        Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object
        oldJunker.drive(5); // drives the Car 5 miles
        oldJunker.fillTank(1); // put in a gallon of gas
        System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
        System.out.println(oldJunker); // prints the attributes of the car to the screen
    }
}
