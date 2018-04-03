package WeatherTests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import proj.Helpers.ApiHelper;

import static org.testng.Assert.assertTrue;

public class GetWeatherTests {


    static String api_key = "54qEVHeWmMx75TcUMRCPnCDr4GH0AS2c";
    static String api_key_wrong = "4qEVHeWmMx75TcUMRCPnCDr4GH0AS2c";
    static String Kyiv = "324505";

    @Test
    public void testSuccess() {
        Response response = ApiHelper.getCityInfo(api_key, "Kyiv");
        assertTrue(response.statusCode()==200);
    }

    @Test
    public void testUnauthorized() {
        Response response = ApiHelper.getCityInfo(api_key_wrong, "Kyiv");
        assertTrue(response.statusCode()==401);
    }

    @Test
    public void getKyivForecast() {
        ApiHelper.getDailyForecast(api_key, Kyiv);
    }
}
