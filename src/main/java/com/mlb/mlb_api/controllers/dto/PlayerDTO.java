package com.mlb.mlb_api.controllers.dto;

import javax.persistence.Column;

public class PlayerDTO {

    private  String name;
    private  Integer age;
    private Double yearOfExperience;
    private Double rating;



    public PlayerDTO(String name, Integer age, Double yearOfExperience, Double rating) {
        this.name = name;
        this.age = age;
        this.yearOfExperience = yearOfExperience;
        this.rating = rating;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Integer getAge() {return age;}

    public void setAge(Integer age) {this.age = age;}

    public Double getYearOfExperience() {return yearOfExperience;}

    public void setYearOfExperience(Double yearOfExperience) {this.yearOfExperience = yearOfExperience;}

    public Double getRating() {return rating;}

    public void setRating(Double rating) {this.rating = rating;}


}
