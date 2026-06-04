package exercise01instrument;

public class PercussionInstrument extends Instrument{

    public PercussionInstrument(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Playing a percussion instrument");
    }
}
