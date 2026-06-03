package sportnews;

public class F1News extends News {
    private String team;

    public F1News(String title, String team) {
        super(title);
        this.team = team;
        calculatePrice();
        calculateScore();
    }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    @Override
    public void calculatePrice() {
        double price = 100;
        if (team != null && (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes"))) {
            price += 50;
        }
        setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 4;
        if (team != null && (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes"))) {
            score += 2;
        }
        setScore(score);
    }
}
