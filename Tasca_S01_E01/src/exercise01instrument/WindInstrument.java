package exercise01instrument;

public class WindInstrument extends Instrument{

    public WindInstrument(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing a wind instrument");
    }
}