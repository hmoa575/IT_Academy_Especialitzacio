package sportnews;

public class BasketballNews extends News {
    private String competition;
    private String club;

    public BasketballNews(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
        calculatePrice();
        calculateScore();
    }

    public String getCompetition() { return competition; }
    public void setCompetition(String competition) { this.competition = competition; }
    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }

    @Override
    public void calculatePrice() {
        double price = 250;
        if ("Euroleague".equalsIgnoreCase(competition)) {
            price += 75;
        }
        if (club != null && (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))) {
            price += 75;
        }
        setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if ("Euroleague".equalsIgnoreCase(competition)) {
            score += 3;
        } else if ("ACB".equalsIgnoreCase(competition)) {
            score += 2;
        }
        if (club != null && (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))) {
            score += 1;
        }
        setScore(score);
    }
}
