package exercise02car;

public class Main {
    public static void main(String[] args){

        Car.brake(); //Static method. Without object.
        Car car = new Car(145); // Car instance.
        car.accelerate();
        System.out.println("The new car brand " + car.getBrand() + " with the model " + car.getModel() + " has a power of " + car.getPower().toString());

        Car car2 = new Car(20);
        car2.setModel("- T");
        System.out.println("\nThe new car brand " + car2.getBrand() + " with the model " + car2.getModel() + " has a power of " + car2.getPower().toString());

        car.setModel("Explorer");

        System.out.println("\nThe new car brand " + car.getBrand() + " with the model " + car.getModel() + " has a power of " + car.getPower().toString());
        System.out.println("\nStatic variables affect all instances of the class.");


        //public void method.
        car2.setModel("- T");
        System.out.println("\nThe vehicle " + car2.getBrand() + " " + car2.getModel() + ":");
        car2.accelerate();

        //public static method.
        car.setModel("Explorer");
        System.out.println("\nThe vehicle " + car.getBrand() + " " + car.getModel() + ":");
        Car.brake();
    }
}
