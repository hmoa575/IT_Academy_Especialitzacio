package exercise02car;

public class Main {
    public static void main(String[] args){

        Car.brake(); //Static method. Able without object.

        Car car = new Car(145); // Car instance.
        car.accelerate();

    }
}
