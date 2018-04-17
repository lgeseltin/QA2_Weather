package model;

import java.math.BigDecimal;

public class Sys {
    private Integer type;
    private Integer id;
    private BigDecimal message;
    private String country;
    private BigDecimal sunrise;
    private BigDecimal sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMessage() {
        return message;
    }

    public void setMessage(BigDecimal message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getSunrise() {
        return sunrise;
    }

    public void setSunrise(BigDecimal sunrise) {
        this.sunrise = sunrise;
    }

    public BigDecimal getSunset() {
        return sunset;
    }

    public void setSunset(BigDecimal sunset) {
        this.sunset = sunset;
    }
}
