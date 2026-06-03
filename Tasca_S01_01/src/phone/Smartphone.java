package phone;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String trade, String model){
        super(trade, model);
    }

    @Override
    public void takePicture(){
        System.out.println("Taking a picture from: " + trade + " " + model);
    }
    @Override
    public void activeAlarm(){
        System.out.println("Alarm! from: " + trade + " " + model);
    }
}

