package exercise03phone;

public class Phone {
    protected  String trade;
    protected  String model;

    public Phone(String trade, String model){
        this.trade = trade;
        this.model = model;
    }

    //Method to make calls.
    public void makeCall(String number){
        System.out.println("Calling to: " + number + " From device: " + trade + " " + model);
    }
}
