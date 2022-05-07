
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class country_query_test {

    @Test
    public void verifica_country(){

        //Movie testMovie = new Movie(1, "movie1", "summary1");
        //when(appService.findMovie(1)).thenReturn(testMovie);


        given().
                header("Content-Type","application/json").
                body("{\"query\":\"query {\\n  country(code:\\\"BE\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\",\"variables\":{}}").
                when().
                post("https://countries.trevorblades.com/").
        then().
                assertThat().
                statusCode(200).
                body("data.country.code",instanceOf(String.class));
        
    }
}




