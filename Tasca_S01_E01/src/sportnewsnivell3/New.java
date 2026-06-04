package sportnewsnivell3;

public abstract class New {
    //Abstract attributes
    private String headline;
    private String text;
    private float price;
    private int points;

    //Constructor
    public New(String headline, String text, float price, int points){
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.points = points;
    }
    //Getters
    public String getHeadline(){
        return headline;
    }
    public String getText(){
        return text;
    }
    public float getPrice(){
        return price;
    }
    public int getPoints(){
        return points;
    }
    //Setters
    public void setHeadline(String headline){
        this.headline= headline;
    }
    public void setText(String text){
        this.text= text;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setPoints(int points){
        this.points = points;
    }

    //abstract methods
    public abstract float calcularPreuNoticia();
    public abstract int calcularPuntuacion();

}
