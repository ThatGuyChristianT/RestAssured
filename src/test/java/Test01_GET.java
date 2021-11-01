import static org.testng.Assert.assertEquals;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test01_GET {

	@Test
	void simpleGetRequest() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString() + "\n" + response.getBody() + "\n" + response.getStatusCode());
		assertEquals(response.getStatusCode(), 200);

	}

}
