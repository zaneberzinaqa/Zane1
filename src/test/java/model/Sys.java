package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys {
    private Double type;
    private Double sys_id;
    private Double message;
    private String country;
    private Double sunrise;
    private Double sunset;

    @JsonProperty(value = "id")
    public Double getSys_id() {
        return sys_id;
    }

    public void setSys_id(Double sys_id) {
        this.sys_id = sys_id;
    }



    public Double getType() {
        return type;
    }

    public void setType(Double type) {
        this.type = type;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getSunrise() {
        return sunrise;
    }

    public void setSunrise(Double sunrise) {
        this.sunrise = sunrise;
    }

    public Double getSunset() {
        return sunset;
    }

    public void setSunset(Double sunset) {
        this.sunset = sunset;
    }
}
