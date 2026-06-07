package exercise04sportnewsnivell3;

public class Tennis extends New{
    //attributes
    private String competition;
    private String mainPlayer;
    //constructor
    public Tennis(String headline, String text, float price, int points, String competition, String mainPlayer) {
        super(headline, text, price, points);
        this.competition = competition;
        this.mainPlayer = mainPlayer;
    }
    //Getters
    public String getCompetition(){return competition;}
    public String getMainPlayer(){return mainPlayer;}

    //Setters
    public void setCompetition(String competition){
        this.competition = competition;
    }
    public void setMainPlayer(String mainPlayer){
        this.mainPlayer = mainPlayer;
    }
    @Override
    public float calcularPreuNoticia(){
        float price = 150;
        if(mainPlayer != null &&  (mainPlayer.equalsIgnoreCase("Djokovic") || mainPlayer.equalsIgnoreCase("Nadal")|| mainPlayer.equalsIgnoreCase("Federer"))){
        price += 100;
        } return price;
    }
    @Override
    public int calcularPuntuacion(){
        int points = 4;
        if(mainPlayer != null &&  (mainPlayer.equalsIgnoreCase("Djokovic") || mainPlayer.equalsIgnoreCase("Nadal")|| mainPlayer.equalsIgnoreCase("Federer"))){
            points += 3;
        }return  points;
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "competition='" + competition + '\'' +
                ", mainPlayer='" + mainPlayer + '\'' +
                '}';
    }
}
