package sportnews;

public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;

    public FootballNews(String title, String competition, String club, String player) {
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
        calculatePrice();
        calculateScore();
    }

    // Getters and setters
    public String getCompetition() { return competition; }
    public void setCompetition(String competition) { this.competition = competition; }
    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }
    public String getPlayer() { return player; }
    public void setPlayer(String player) { this.player = player; }

    @Override
    public void calculatePrice() {
        double price = 300;   // base
        if ("Champions League".equalsIgnoreCase(competition)) {
            price += 100;
        }
        if (club != null && (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))) {
            price += 100;
        }
        if (player != null && (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema"))) {
            price += 50;
        }
        setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 5;   // base
        if ("Champions League".equalsIgnoreCase(competition)) {
            score += 3;
        } else if ("League".equalsIgnoreCase(competition)) {
            score += 2;
        }
        if (club != null && (club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Real Madrid"))) {
            score += 1;
        }
        if (player != null && (player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema"))) {
            score += 1;
        }
        setScore(score);
    }
}


