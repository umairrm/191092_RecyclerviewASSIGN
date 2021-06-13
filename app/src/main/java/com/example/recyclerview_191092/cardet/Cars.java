package com.example.recyclerview_191092.cardet;

public class Cars {
    String cars_name, cars_model;
    String cars_year;


    public Cars(String cars_name, String cars_model, String cars_year) {
        this.cars_name = cars_name;
        this.cars_model = cars_model;
        this.cars_year = cars_year;
    }

    public void setCars_name(String cars_name) {
        this.cars_name = cars_name;
    }

    public void setCars_model(String cars_model) {
        this.cars_model = cars_model;
    }

    public void setCars_year(String cars_year) {
        this.cars_year = cars_year;
    }

    public String getCars_name() {
        return cars_name;
    }

    public String getCars_model() {
        return cars_model;
    }

    public String getCars_year() {
        return cars_year;
    }
}
