package instrument;

public class Main {
    public static void main(String[] args){

        Instrument percussion1 = new PercussionInstrument();
        percussion1.play();
        Instrument string1 = new StringInstrument();
        string1.play();
        Instrument wind1 = new WindInstrument();
        wind1.play();
    }
}


