package proj.Helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

public class ApiHelper {

    static String baseURL = "http://dataservice.accuweather.com";

    public static Response getCityInfo(String apiKey, String city) {
        Response response = get(baseURL + "/locations/v1/cities/search?apikey=" + apiKey + "&q=" + city);
        System.out.println("Country");
        return response;
    }

    public static Response getDailyForecast(String apiKey, String city) {
        Response response = get(baseURL + "/forecasts/v1/daily/1day/"+ city + "?apikey=" + apiKey);
        System.out.println(response.path("DailyForecasts"));
        return response;
    }
}
