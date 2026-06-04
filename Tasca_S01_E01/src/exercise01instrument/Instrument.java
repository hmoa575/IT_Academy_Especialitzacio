package exercise01instrument;

public abstract class Instrument {

    private  String name;
    private  double price;

    public Instrument(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void play();
}
