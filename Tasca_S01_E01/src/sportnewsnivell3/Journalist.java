package sportnewsnivell3;

import java.util.ArrayList;
import java.util.List;

public class Journalist {
    //Attributes
    private String name;
    private String surName;
    private String dni;
    private static float wageBase = 1500; // The same for all journalists.
    private List<New> news;
    //Constructor
    public Journalist(String name, String surName, String dni){
        this.name = name;
        this.surName= surName;
        this.dni = dni;
        news = new ArrayList<>();
    }
    //Getters
    public String getName() {
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public String getDni(){
        return dni;
    }
    public float getWageBase(){
        return wageBase;
    }
    //Setters
    /*
    * For security rules the Setters for News, DNI, Name and SurName are not created in this code.
    * */

    //Methods to manage the list.
    public void addNew(New newArtitle) {
        if(newArtitle != null){
        this.news.add(newArtitle);
    } }
    public void removeNew(New newArticle) {
        this.news.remove(newArticle);
    }
    public int getNewsSize() {
        return news.size();
    }
    public New getNew(int index) {
        if (index >= 0 && index < news.size()) {
            return news.get(index);
        }
        return null;
    }
    public void removeNew(int index) {
        if (index >= 0 && index < news.size()) {
        news.remove(index);
        }
    }
}
