package exercise04sportnewsnivell3;

public class Futbol extends New{
    //Attributes
    private String competition;
    private String clubName;
    private String player;
    //constructor
    public Futbol(String competition, String clubName, String player, String headline, String text, float price, int points){
        super(headline, text, price, points);
        this.competition = competition;
        this.clubName = clubName;
        this.player = player;
    }
    //Getters
    public String getCompetition(){return competition;}
    public String getClubName(){return clubName;}
    public String getPlayer(){return player;}
    //Setters
    public void setCompetition(String competition){ this.competition = competition;}
    public void setClubName(String clubName){this.clubName = clubName;}
    public void setPlayer(String player){this.player = player;}

    @Override
    public float calcularPreuNoticia(){
        float price = 300;
        if(competition != null && competition.equalsIgnoreCase("Champions League"))
            price += 100;
        if(clubName != null && (clubName.equalsIgnoreCase("Barca") || clubName.equalsIgnoreCase("Madrid")))
            price +=100;
        if(player != null && (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")))
            price += 50;
        return price;
    }
@Override
    public int calcularPuntuacion(){
        int points = 5;
    if(competition != null && competition.equalsIgnoreCase("Champions League"))
        points += 3;
    if(competition != null && competition.equalsIgnoreCase("La Liga"))
        points += 2;
    if(clubName != null && (clubName.equalsIgnoreCase("Barca") || clubName.equalsIgnoreCase("Madrid")))
        points +=1;
    if(player != null && (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema")))
        points += 1;
    return points;
}
    @Override
    public String toString() {
        return "Futbol{" +
                "competition='" + competition + '\'' +
                ", clubName='" + clubName + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}


