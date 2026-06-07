package exercise04sportnewsnivell3;

public class Basketball extends New {
    //Attributes
    private String competition;
    private String clubName;
    //Constructor
    public Basketball(String competition, String clubName, String headline, String text, float price, int points){
        super(headline, text, price, points);
        this.competition = competition;
        this.clubName = clubName;
    }
    //Getters
    public String getCompetition(){ return competition;}
    public String getClubName(){return clubName}
    //Setters
    public void setCompetition(String competition){this.competition = competition;}
    public void setClubName(String clubName){this.clubName = clubName;}
    //Methods
    @Override
    public float calcularPreuNoticia(){
        float price = 250;
        if(competition != null && competition.equalsIgnoreCase("EuroLeague"))
            price += 75;
        if(clubName != null && (clubName.equalsIgnoreCase("Barca") || clubName.equalsIgnoreCase("Madrid")))
            price += 75;
        return price;
    }
    @Override
    public int calcularPuntuacion() {
    int points = 4;
        if(competition != null && competition.equalsIgnoreCase("EuroLeague")){
            points += 3;
        }else if(competition != null && competition.equalsIgnoreCase("ACB")){
            points += 2;
        }
        if(clubName != null && (clubName.equalsIgnoreCase("Barca") || clubName.equalsIgnoreCase("Madrid")))
            points += 1;
        return points;
    }
    @Override
    public String toString() {
        return "Basketball{" +
                "competition='" + competition + '\'' +
                ", clubName='" + clubName + '\'' +
                '}';
    }
}
