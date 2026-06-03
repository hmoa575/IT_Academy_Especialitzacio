package sportnews;

import sportnews.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Journalist> journalists = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = readInt("Choose an option: ");
            switch (option) {
                case 1 -> addJournalist();
                case 2 -> removeJournalist();
                case 3 -> addNewsToJournalist();
                case 4 -> removeNewsFromJournalist();
                case 5 -> showNewsOfJournalist();
                case 6 -> calculateNewsScore();
                case 7 -> calculateNewsPrice();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (option != 0);
    }

    private static void showMenu() {
        System.out.println("\n--- SPORTS NEWS EDITORIAL SYSTEM ---");
        System.out.println("1. Add journalist");
        System.out.println("2. Remove journalist");
        System.out.println("3. Add news to a journalist");
        System.out.println("4. Remove news from a journalist (by title)");
        System.out.println("5. Show all news of a journalist");
        System.out.println("6. Calculate score of a news");
        System.out.println("7. Calculate price of a news");
        System.out.println("0. Exit");
    }

    // Helper: read integer from console
    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid number. " + prompt);
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }

    private static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // 1. Add journalist
    private static void addJournalist() {
        String name = readString("Name: ");
        String dni = readString("DNI: ");
        journalists.add(new Journalist(name, dni));
        System.out.println("Journalist added successfully.");
    }

    // 2. Remove journalist
    private static void removeJournalist() {
        String dni = readString("Enter DNI of journalist to remove: ");
        boolean removed = journalists.removeIf(j -> j.getDni().equals(dni));
        if (removed) System.out.println("Journalist removed.");
        else System.out.println("Journalist not found.");
    }

    // 3. Add news to a journalist
    private static void addNewsToJournalist() {
        Journalist journalist = findJournalistByDNI();
        if (journalist == null) return;

        System.out.println("Select news type:");
        System.out.println("1. Football  2. Basketball  3. Tennis  4. F1  5. MotoGP");
        int type = readInt("Type: ");
        String title = readString("Title: ");

        News news = null;
        switch (type) {
            case 1 -> {
                String competition = readString("Competition: ");
                String club = readString("Club: ");
                String player = readString("Player: ");
                news = new FootballNews(title, competition, club, player);
            }
            case 2 -> {
                String competition = readString("Competition: ");
                String club = readString("Club: ");
                news = new BasketballNews(title, competition, club);
            }
            case 3 -> {
                String competition = readString("Competition: ");
                String players = readString("Tennis players (comma separated): ");
                news = new TennisNews(title, competition, players);
            }
            case 4 -> {
                String team = readString("Team: ");
                news = new F1News(title, team);
            }
            case 5 -> {
                String team = readString("Team: ");
                news = new MotoGPNews(title, team);
            }
            default -> System.out.println("Invalid type.");
        }
        if (news != null) {
            journalist.addNews(news);
            System.out.println("News added successfully.");
        }
    }

    // 4. Remove news from journalist
    private static void removeNewsFromJournalist() {
        Journalist journalist = findJournalistByDNI();
        if (journalist == null) return;
        String title = readString("Enter news title to remove: ");
        if (journalist.removeNewsByTitle(title)) {
            System.out.println("News removed.");
        } else {
            System.out.println("News not found.");
        }
    }

    // 5. Show all news of a journalist
    private static void showNewsOfJournalist() {
        Journalist journalist = findJournalistByDNI();
        if (journalist == null) return;
        List<News> newsList = journalist.getNewsList();
        if (newsList.isEmpty()) {
            System.out.println("No news for this journalist.");
        } else {
            System.out.println("News of " + journalist.getName() + ":");
            for (int i = 0; i < newsList.size(); i++) {
                System.out.println((i+1) + ". " + newsList.get(i));
            }
        }
    }

    // 6. Calculate score of a specific news
    private static void calculateNewsScore() {
        Journalist journalist = findJournalistByDNI();
        if (journalist == null) return;
        List<News> newsList = journalist.getNewsList();
        if (newsList.isEmpty()) {
            System.out.println("No news available.");
            return;
        }
        showNewsOfJournalist(); // show titles
        int idx = readInt("Enter news number to calculate its score: ") - 1;
        if (idx >= 0 && idx < newsList.size()) {
            News n = newsList.get(idx);
            n.calculateScore(); // recalc (or just print existing)
            System.out.println("Score for \"" + n.getTitle() + "\" is: " + n.getScore());
        } else {
            System.out.println("Invalid number.");
        }
    }

    // 7. Calculate price of a specific news
    private static void calculateNewsPrice() {
        Journalist journalist = findJournalistByDNI();
        if (journalist == null) return;
        List<News> newsList = journalist.getNewsList();
        if (newsList.isEmpty()) {
            System.out.println("No news available.");
            return;
        }
        showNewsOfJournalist();
        int idx = readInt("Enter news number to calculate its price: ") - 1;
        if (idx >= 0 && idx < newsList.size()) {
            News n = newsList.get(idx);
            n.calculatePrice();
            System.out.println("Price for \"" + n.getTitle() + "\" is: " + n.getPrice() + " €");
        } else {
            System.out.println("Invalid number.");
        }
    }

    private static Journalist findJournalistByDNI() {
        String dni = readString("Enter journalist DNI: ");
        for (Journalist j : journalists) {
            if (j.getDni().equals(dni)) return j;
        }
        System.out.println("Journalist not found.");
        return null;
    }
}
