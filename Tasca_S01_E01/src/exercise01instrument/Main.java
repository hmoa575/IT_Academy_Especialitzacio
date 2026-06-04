package exercise01instrument;

public class Main {
    public static void main(String[] args){
        
        Instrument.staticMethod();
        Instrument wind1 = new WindInstrument("Trompeta", 200);
        Instrument percussion1 = new PercussionInstrument("Pandereta", 100);
        Instrument string1 = new StringInstrument("Arpa", 1500);

        //object wind1
        wind1.play();
        System.out.println("The " + wind1.getName() + " has the price of: " + wind1.getPrice() +" Euros.");

        //object percussion1
        percussion1.play();
        System.out.println("The " + percussion1.getName() + " has the price of: " + percussion1.getPrice() +" Euros.");

        //object string1
        string1.play();
        System.out.println("The " + string1.getName() + " has the price of: " + string1.getPrice() +" Euros.");
    }
}



