package cucumberStepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import model.Weather;
import org.junit.Assert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class stepDef {
    private weatherRequester weatherRequester = new weatherRequester();
    private Response response = new Response();

    @When("we are requesting weather")
    public void get_weather_result() throws IOException {
        response = weatherRequester.getWeather();
    }

    @Then("LON should be (.*)")
    public void check_lon(BigDecimal lon) {
        Assert.assertEquals("Wrong LON: ", lon, response.getCoord().getLon());
    }

    @Then("LAT should be (.*)")
    public void check_lat(BigDecimal lat) {
        Assert.assertEquals("Wrong LAT", lat, response.getCoord().getLat());

    }

    @Then("weather list should be:")
    public void check_WeatherID(List<Weather> weather) {
        for (int i = 0; i < weather.size(); i++) {
            Assert.assertEquals("Wrong weather list element count", weather.size(), response.getWeather().size());

            Assert.assertEquals("Wrong weather id in element " + i, weather.get(i).getId(), response.getWeather().get(i).getId());
            Assert.assertEquals("Wrong weather main", weather.get(i).getMain(), response.getWeather().get(i).getMain());
            Assert.assertEquals("Wrong weather descr", weather.get(i).getDescription(), response.getWeather().get(i).getDescription());
            Assert.assertEquals("Wrong weather icon", weather.get(i).getIcon(), response.getWeather().get(i).getIcon());
        }
    }

    @Then("BASE should be (.*)")
    public void check_base(String base) {
        Assert.assertEquals("Wrong BASE", base, response.getBase());
    }

    @Then("TEMP should be (.*)")
    public void check_temp(BigDecimal temp) {
        Assert.assertEquals("Wrong TEMP", temp, response.getMain().getTemp());
    }

    @Then("PRESSURE should be (.*)")
    public void check_pressure(int pressure) {
        Assert.assertEquals("Wrong PRESSURE", pressure, response.getMain().getPressure());
    }

    @Then("HUMIDITY should be (.*)")
    public void check_humidity(int humidity) {
        Assert.assertEquals("Wrong HUMIDITY", humidity, response.getMain().getHumidity());
    }

    @Then("TEMP_MIN should be (.*)")
    public void check_temp_min(BigDecimal temp_min) {
        Assert.assertEquals("Wrong TEMP_MIN", temp_min, response.getMain().getTemp_min());
    }

    @Then("TEMP_MAX should be (.*)")
    public void check_temp_max(BigDecimal temp_max) {
        Assert.assertEquals("Wrong TEMP_MIN", temp_max, response.getMain().getTemp_max());
    }


    @Then("VISIBILITY should be (.*)")
    public void check_visibility(Integer visibility) {
        Assert.assertEquals("Wrong VISIBILITY", visibility, response.getVisibility());
    }

    @Then("SPEED should be (.*)")
    public void check_speed(BigDecimal speed) {
        Assert.assertEquals("Wrong SPEED", speed, response.getWind().getSpeed());
    }

    @Then("DEG should be (.*)")
    public void check_deg(Integer deg) {
        Assert.assertEquals("Wrong DEG", deg, response.getWind().getDeg());
    }

    @Then("ALL should be (.*)")
    public void check_all(Integer all) {
        Assert.assertEquals("Wrong ALL", all, response.getClouds().getAll());
    }

    @Then("DT should be (.*)")
    public void check_dt(Integer dt) {
        Assert.assertEquals("Wrong DT", dt, response.getDt());
    }

    @Then("TYPE should be (.*)")
    public void check_type(Integer type) {
        Assert.assertEquals("Wrong Type", type, response.getSys().getType());
    }

    @Then("SYS_ID should be (.*)")
    public void check_id(Integer id) {
        Assert.assertEquals("Wrong ID", id, response.getSys().getId());
    }

    @Then("MESSAGE should be (.*)")
    public void check_message(BigDecimal message) {
        Assert.assertEquals("Wrong MESSAGE", message, response.getSys().getMessage());
    }

    @Then("COUNTRY should be (.*)")
    public void check_country(String country) {
        Assert.assertEquals("Wrong COUNTRY", country, response.getSys().getCountry());
    }

    @Then("SUNRISE should be (.*)")
    public void check_sunrise(BigDecimal sunrise) {
        Assert.assertEquals("Wrong SUNRISE", sunrise, response.getSys().getSunrise());
    }

    @Then("SUNSET should be (.*)")
    public void check_sunset(BigDecimal sunset) {
        Assert.assertEquals("Wrong SUNRISE", sunset, response.getSys().getSunset());
    }

    @Then("ID should be (.*)")
    public void check_ID(BigInteger id) {
        Assert.assertEquals("Wrong ID", id, response.getId());
    }

    @Then("NAME should be (.*)")
    public void check_name(String name) {
        Assert.assertEquals("Wrong NAME", name, response.getName());
    }

    @Then("COD should be (.*)")
    public void check_cod(int cod) {
        Assert.assertEquals("Wrong COD", cod, response.getCod());
    }
}
