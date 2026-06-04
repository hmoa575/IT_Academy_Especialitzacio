package exercise01instrument;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price){
        super(name, price);
    }
    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void setPrice(double price) {
        this.price = price;
    }

    @Override
    double getPrice() {
        return price;
    }

    @Override
    public void play() {
        System.out.println("Playing a wind instrument");
    }
}