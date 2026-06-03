package car;

public class Car {
    static final String brand = "ford";
    static String model = "Mustang";
    final int power;

    public Car(int power) {
        this.power = power;
    }

    //  Static method. Able without object.
    public static void brake() {
        System.out.println("The car is braking");
    }
    //No static method. Instance needed.
    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}

