package sportnews;

public class TennisNews extends News {
    private String competition;
    private String tennisPlayers;   // simplified as a string

    public TennisNews(String title, String competition, String tennisPlayers) {
        super(title);
        this.competition = competition;
        this.tennisPlayers = tennisPlayers;
        calculatePrice();
        calculateScore();
    }

    public String getCompetition() { return competition; }
    public void setCompetition(String competition) { this.competition = competition; }
    public String getTennisPlayers() { return tennisPlayers; }
    public void setTennisPlayers(String tennisPlayers) { this.tennisPlayers = tennisPlayers; }

    @Override
    public void calculatePrice() {
        double price = 150;
        if (tennisPlayers != null &&
                (tennisPlayers.toLowerCase().contains("federer") ||
                        tennisPlayers.toLowerCase().contains("nadal") ||
                        tennisPlayers.toLowerCase().contains("djokovic"))) {
            price += 100;
        }
        setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (tennisPlayers != null &&
                (tennisPlayers.toLowerCase().contains("federer") ||
                        tennisPlayers.toLowerCase().contains("nadal") ||
                        tennisPlayers.toLowerCase().contains("djokovic"))) {
            score += 3;
        }
        setScore(score);
    }
}
