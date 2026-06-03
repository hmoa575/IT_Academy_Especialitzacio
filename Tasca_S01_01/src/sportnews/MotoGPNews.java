package sportnews;

public class MotoGPNews extends News {
    private String team;

    public MotoGPNews(String title, String team) {
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
        if (team != null && (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha"))) {
            price += 50;
        }
        setPrice(price);
    }

    @Override
    public void calculateScore() {
        int score = 3;
        if (team != null && (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha"))) {
            score += 3;
        }
        setScore(score);
    }
}

