package exercise03phone;

public class Main {
    public static void main(String[] args) {
        Smartphone mySmartphone = new Smartphone("Apple", "17 Pro Max");

        mySmartphone.makeCall(612345678);
        mySmartphone.takePicture();
        mySmartphone.activeAlarm();
    }
}