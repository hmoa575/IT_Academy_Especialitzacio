package exercise01instrument;

public abstract class Instrument {

    //Atributos
    protected   String name;
    protected   double price;

    //Static field.
    private static final String WHATIS = "instrument";

    //Static initialization block
    private static int contador;
    static{
        contador = 0;
        System.out.println("Static block: runs when the class is loaded.");
    }

    {
        int id = ++contador;
        System.out.println("Instance initialization block: runs each time you create a new object. Number id: " + id);
    }

    //Constructor
    public Instrument(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Constructor method
    public static void staticMethod(){
        System.out.println("Static Method Executed.");
    }

    //Getters and Setters (abstracts)

    abstract void setName(String name);

    abstract String getName();

    abstract void setPrice(double price);

    abstract double getPrice();

    //Abstract methods.
    public abstract void play();

}
