package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigInteger;
import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private Coord coord;

    //    @JsonProperty("weather")
    private List<Weather> weather;

    //    @JsonProperty("base")
    private String base;

    private Main main;

    //    @JsonProperty("visibility")
    private Integer visibility;

    private Wind wind;

    private Clouds clouds;

    @JsonProperty("dt")
    private Integer dt;

    private Sys sys;

    @JsonProperty("id")
    private BigInteger id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private Integer cod;

    //COORD
    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    // ??????????????????????????????????????????????????????????????????????????
    // ??????????????????????????????????????????????????????????????????????????
    //WEATHER
    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }


    //BASE
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    //MAIN
    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    //VISIBILITY
    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    //WIND
    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    //CLOUDS
    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    //DT
    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    //SYS
    public Sys getSys() {
        return sys;
    }

    public void setSysID(Sys sys) {
        this.sys = sys;
    }

    //ID
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    //NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //COD
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
