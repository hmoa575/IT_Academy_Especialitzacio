package exercise04sportnewsnivell3;

public class Formula1 extends New{
    //attributes
    private String team;
    //Constructor
    public Formula1(String headline, String text, float price, int points, String team){
        super(headline, text, price, points);
        this.team = team;
    }
    //Getters
    public String getTeam(){return team;}
    //Setters
    public void setTeam(String team){this.team = team;}

    @Override
    public float calcularPreuNoticia(){
        float price = 100;
        if(team != null && (team.equalsIgnoreCase("Mercedes")||team.equalsIgnoreCase("Ferrari"))){
            price += 50;
        } return price;
    }
    @Override
    public int calcularPuntuacion(){
        int points = 4;
        if(team != null && (team.equalsIgnoreCase("Mercedes")||team.equalsIgnoreCase("Ferrari"))){
            points += 3;
        }return points;
    }
    @Override
    public String toString() {
        return "Moto{" +
                "team='" + team + '\'' +
                '}';
    }
}
