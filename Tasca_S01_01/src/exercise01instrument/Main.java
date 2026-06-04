package exercise01instrument;

public class Main {
    public static void main(String[] args){

        Instrument percussion1 = new PercussionInstrument("tambor", 100);
        percussion1.play();
        Instrument string1 = new StringInstrument("Guitarra", 120);
        string1.play();
        Instrument wind1 = new WindInstrument( "flauta", 500 );
        wind1.play();
    }
}


