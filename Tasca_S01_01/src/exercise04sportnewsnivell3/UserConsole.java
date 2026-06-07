package exercise04sportnewsnivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserConsole {

    public void launchApp(){
       Scanner inData = new Scanner(System.in);
       List<Journalist> journalist = new ArrayList<>();
       boolean exit = false;
       int option = -1;
       do {
           showMenu();
           System.out.println("Choose an option: ");
           String input = inData.nextLine();
           try {
               Scanner inData = new Scanner(System.in);
               option = Integer.parseInt(input);
               switch (option) {
                   case 1 -> addJournalist();
                   case 2 -> removeJournalist();
                   case 3 -> addNews();
                   case 4 -> removeNews();
                   case 5 -> showJournalistNews();
                   case 6 -> calculateNewsScore();
                   case 7 -> calculateNewsPrice();
                   case 0 -> System.out.println("Exiting the program...");
                   default -> System.out.println("Invalid option.");
               }
           } catch (NumberFormatException e) {
               System.out.println("Type a valid number 0 to 7, please...");
           }
       }while (option != 0);
    inData.close();
           }
    public void showMenu(){
        System.out.println("\n--- NEWS MANAGEMENT MENU ---");
        System.out.println("1. Add journalist");
        System.out.println("2. Remove journalist");
        System.out.println("3. Add news to a journalist");
        System.out.println("4. Remove news (requires journalist and news headline)");
        System.out.println("5. Show all news from a journalist");
        System.out.println("6. Calculate news score");
        System.out.println("7. Calculate news price");
        System.out.println("0. Exit");
    }
    //Methods of the Menu.
    //Option 1.
    public void addJournalist() {
        System.out.println("Type the Journalist Name: ");
        String name = inData.nextLine();
        System.out.println("Type the Journalist Surname: ");
        String surName = inData.nextLine();
        System.out.println("Type the Journalist DNI: ");
        String dni = inData.nextLine();
        journalist.add(new Journalist(name, surName, dni));
        System.out.println("Journalist added.");

    }

    public void removeJournalist() {
    }

    public void addNews() {
    }

    public void removeNews() {
    }

    public void showJournalistNews() {
    }

    public void calculateNewsScore() {
    }

    public void calculateNewsPrice() {
    }

    }

