package com.example.weatherapp;

public class WeatherRVModel {
    private String time;
    private String tempreture;
    private String icom;
    private String windSpeed;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTempreture() {
        return tempreture;
    }

    public void setTempreture(String tempreture) {
        this.tempreture = tempreture;
    }

    public String getIcom() {
        return icom;
    }

    public void setIcom(String icom) {
        this.icom = icom;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WeatherRVModel(String time, String tempreture, String icom, String windSpeed) {
        this.time = time;
        this.tempreture = tempreture;
        this.icom = icom;
        this.windSpeed = windSpeed;
    }
}
