package exercise02car;

public class Car {
    //Atributos
    private static final String brand = "FORD";
    private static String model = "Mustang";
    private final int power;

    //Constructor
    public Car(int power) {
        this.power = power;
    }

    //Getters and Setters.
    public void setModel(String model)
    {
        Car.model = model;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }

    public Integer getPower()
    {
        return this.power;
    }

    //  Static method. without object.
    public static void brake() {
        System.out.println("The car is braking");
    }
    //No static method. Instance needed.
    public void accelerate() {
        System.out.println("The car is accelerating");
    }
}

