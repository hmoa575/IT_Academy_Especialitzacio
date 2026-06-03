package sportnews;

import java.util.ArrayList;
import java.util.List;

public class Journalist {
    private final String dni;          // immutable (final)
    private String name;
    private static double salary = 1500.0;   // same for all journalists

    private List<News> newsList;

    public Journalist(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.newsList = new ArrayList<>();
    }

    // Getters and setters
    public String getDni() { return dni; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public static double getSalary() { return salary; }
    public static void setSalary(double newSalary) { salary = newSalary; }

    public List<News> getNewsList() { return newsList; }

    public void addNews(News news) {
        newsList.add(news);
    }

    public boolean removeNewsByTitle(String title) {
        return newsList.removeIf(news -> news.getTitle().equalsIgnoreCase(title));
    }

    @Override
    public String toString() {
        return "Journalist{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", salary=" + salary +
                ", newsCount=" + newsList.size() +
                '}';
    }
}