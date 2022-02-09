package com.example.brendancode.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @GeneratedValue
    private int film_id;
    private String title;
    private String rating;
    private int release_year;



    public Film(String title, int release_year, String rating){
        this.title = title;
        this.release_year = release_year;
        this.rating = rating;
    }

    public Film(){

    }

    public int getFilm_id() {
        return film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
