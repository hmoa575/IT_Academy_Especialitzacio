package exercise01instrument;

public class Main {
    public static void main(String[] args){

        Instrument percussion1 = new PercussionInstrument();
        percussion1.play();
        Instrument string1 = new StringInstrument();
        Instrument guitarra = new StringInstrument("Guitarra", 120);
        string1.play();
        Instrument wind1 = new WindInstrument();
        Instrument flauta = new WindInstrument( "flauta", 500 );
        wind1.play();
    }
}


