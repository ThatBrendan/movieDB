package com.example.brendancode.demo;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int film_id;
    private String title;
    private String rating;
    private int release_year;
    private int language_id;
    private String description;

    //Mapping the many-to-many relationship between Film and Actor into Film.
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_actor",
        joinColumns = {
            @JoinColumn(name = "film_id",referencedColumnName = "film_id", nullable = false, updatable = false)
    },
        inverseJoinColumns = {
            @JoinColumn(name = "actor_id", referencedColumnName = "actor_id", nullable = false, updatable = false)
    })
    private Set<Actor> actor = new HashSet<>();

    //Mapping the many-to-many relationship between Film and Category into Film.
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_category",
        joinColumns = {
            @JoinColumn(name ="film_id", referencedColumnName = "film_id", nullable = false, updatable = false)
        },
            inverseJoinColumns = {
            @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false, updatable = false)
            })
    private Set<Category> category = new HashSet<>();

//    //Needed to add One-to-Many connection to get userreview table
    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL)
    private Set<UserReview> userReview = new HashSet<>();






    public Film(String title, int release_year, String rating, int language_id, String description){
        this.title = title;
        this.release_year = release_year;
        this.rating = rating;
        this.language_id = language_id;
        this.description = description;
    }



    public Film() {

    }

    public Film(String title, String release_year, String rating) {
    }

    public Film(String title, int release_year, String rating) {
    }

    public Film(String title, int release_year, String rating, String description) {
    }

    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
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

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category> getCategory() {
        return category;
    }


    public Set<UserReview> getUserReview() {
        return userReview;
    }

    public void setUserReview(Set<UserReview> userReview) {
        this.userReview = userReview;
    }
}
