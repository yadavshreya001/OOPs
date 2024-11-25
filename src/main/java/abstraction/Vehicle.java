package abstraction;
public abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    @Override
    public  void start() {
        System.out.println("Car started...");
    }
}
class Scooter extends Vehicle {
    @Override
    public void start(){
        System.out.println("Scooter started...");
    }
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        Scooter scooter = new Scooter();
//        scooter.start();
        Vehicle vehicle = new Scooter();
        vehicle.start();
        Vehicle vehicle2 = new Car();
        vehicle2.start();
    }
}