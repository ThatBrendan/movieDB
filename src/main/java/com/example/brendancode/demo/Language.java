package com.example.brendancode.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int language_id;


        private String name;

    public Language(){

    }
        public Language(String name){
            this.name = name;
        }


    public int getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
