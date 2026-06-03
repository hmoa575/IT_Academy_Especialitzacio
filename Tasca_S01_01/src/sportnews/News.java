package sportnews;

public abstract class News {
    private String title;
    private String text;      // empty when created
    private int score;
    private double price;

    public News(String title) {
        this.title = title;
        this.text = "";
        this.score = 0;
        this.price = 0.0;
    }

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract methods to be implemented by subclasses
    public abstract void calculatePrice();
    public abstract void calculateScore();

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", score=" + score +
                ", price=" + price +
                '}';
    }
}

