package com.example.mymulti_screenapp;

public class CountryItem {
    String name;
    int infected;
    int deaths;
    int recovered;

    public CountryItem(String name, int infected, int deaths, int recovered) {
        this.name = name;
        this.infected = infected;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }
}
