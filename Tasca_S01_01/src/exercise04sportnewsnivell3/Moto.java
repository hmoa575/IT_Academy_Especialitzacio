package exercise04sportnewsnivell3;

public class Moto extends New{
    //attributes
    private String team;
    //Constructor
    public Moto(String headline, String text, float price, int points, String team){
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
    if(team != null && (team.equalsIgnoreCase("Honda")||team.equalsIgnoreCase("Yamaha"))){
        price += 50;
        } return price;
    }
    @Override
    public int calcularPuntuacion(){
        int points = 4;
        if(team != null && (team.equalsIgnoreCase("Honda")||team.equalsIgnoreCase("Yamaha"))){
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