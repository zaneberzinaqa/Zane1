package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Coord coord;
    private List<Weather>weather;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {

        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() { return main; }

    public void setMain(Main main) {

        this.main = main;
    }

    public Wind getWind() { return wind; }

        public void setWind(Wind wind) {

        this.wind = wind;
    }

    public Clouds getClouds() { return clouds; }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Sys getSys() { return sys; }

    public void setSys(Sys sys) {
        this.sys = sys;
    }
}
