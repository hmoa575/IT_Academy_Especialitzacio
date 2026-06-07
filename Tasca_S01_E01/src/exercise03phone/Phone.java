package exercise03phone;

public class Phone {
    protected   String trade;
    protected  String model;

    public Phone(String trade, String model){
        this.trade = trade;
        this.model = model;
    }

    //Method to make calls.
    public void makeCall(int number){
        System.out.println("Calling to: " + Integer.toString(number) + " From device: " + trade + " " + model);
    }
}
