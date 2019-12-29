package cucumberStepDefinition;
import com.fasterxml.jackson.core.JsonProcessingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.jupiter.api.Assertions;
import requestors.Weatherrequestor;

public class Test {
    private String city;
    private Response response;

    @Given("city is: (.*)")
    public void set_city(String city) {
        this.city = city;
    }

    @When("we are requesting weather")
    public void request_weather() throws JsonProcessingException {
        Weatherrequestor requestor = new Weatherrequestor();
        response = requestor.requestWeather(city);
    }

    @Then("lon is (.*)")
    public void check_lon(Double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "wrong lon");
    }

    @And("lat is (.*)")
    public void check_lat(Double lat) {
        Assertions.assertEquals(lat, response.getCoord().getLat(), "wrong lat");

    }

    @And("weather_id is (.*)")
    public void check_weather_id(Double weather_id) {
        Assertions.assertEquals(weather_id, response.getWeather().get(0).getWeather_id(), "wrong weather id");
    }

    @And("main is (.*)")
    public void check_main(String main) {
        Assertions.assertEquals(main, response.getWeather().get(0).getMain(), "wrong main");
    }

    @And("description is (.*)")
    public void check_description(String description) {
        Assertions.assertEquals(description, response.getWeather().get(0).getDescription(), "wrong description");
    }

    @And("icon is (.*)")
    public void check_icon(String icon) {
        Assertions.assertEquals(icon, response.getWeather().get(0).getIcon(), "wrong icon");
    }

    @And("temp is (.*)")
    public void check_temp(Double temp) {
        Assertions.assertEquals(temp, response.getMain().getTemp(), "wrong temp");
    }

    @And("pressure is (.*)")
    public void check_pressure(Double pressure) {
        Assertions.assertEquals(pressure, response.getMain().getPressure(), "wrong pressure");
    }

    @And("humidity is (.*)")
    public void check_humidity(Double humidity) {
        Assertions.assertEquals(humidity, response.getMain().getHumidity(), "wrong humidity");
    }

    @And("temp_min is (.*)")
    public void check_temp_min(Double temp_min) {
        Assertions.assertEquals(temp_min, response.getMain().getTemp_min(), "wrong temp_min");
    }

    @And("temp_max is (.*)")
    public void check_temp_max(Double temp_max) {
        Assertions.assertEquals(temp_max, response.getMain().getTemp_max(), "wrong max temp");
    }

    @And("speed is (.*)")
    public void check_speed(Double speed) { Assertions.assertEquals(speed, response.getWind().getSpeed(), "wrong speed"); }

    @And("deg is (.*)")
    public void check_deg(Double deg) {
        Assertions.assertEquals(deg, response.getWind().getDeg(), "wrong deg");
    }

    @And("all is (.*)")
    public void check_all(Double all) {
        Assertions.assertEquals(all, response.getClouds().getAll(), "wrong all");
    }

    @And("type is (.*)")
    public void check_type(Double type) {
        Assertions.assertEquals(type, response.getSys().getType(), "wrong type");
    }

    @And("sys_id is (.*)")
    public void check_sys_id(Double sys_id) { Assertions.assertEquals(sys_id, response.getSys().getSys_id(), "wrong sys id"); }

    @And("message is (.*)")
    public void check_message(Double message) { Assertions.assertEquals(message, response.getSys().getMessage(), "wrong message"); }

    @And("country is (.*)")
    public void check_country(String country) { Assertions.assertEquals(country, response.getSys().getCountry(), "wrong country"); }

    @And("sunrise is (.*)")
    public void check_sunrise(Double sunrise) { Assertions.assertEquals(sunrise, response.getSys().getSunrise(), "wrong sunrise"); }

    @And("sunset is (.*)")
    public void check_sunset(Double sunset) { Assertions.assertEquals(sunset, response.getSys().getSunset(), "wrong sunset"); }
}
