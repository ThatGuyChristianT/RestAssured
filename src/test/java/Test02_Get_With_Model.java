import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import rest.reqres.ReqRes;

import static org.testng.AssertJUnit.assertEquals;

public class Test02_Get_With_Model {

    @Test
    @SneakyThrows({JsonProcessingException.class})
    public void getRequestWithModelTest() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        assertEquals(response.getStatusCode(), 200);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ReqRes reqRes = mapper.readValue(response.asString(), ReqRes.class);


    }
}
