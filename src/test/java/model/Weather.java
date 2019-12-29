package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    @JsonProperty(value = "id")
    private Double weather_id;
    private String main;
    private String description;
    private String icon;

    public Double getWeather_id() {
        return weather_id;
    }

    public void setId(Double weather_id) {
        this.weather_id = weather_id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
