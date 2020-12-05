import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {

	@Test
	void test() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString() + "\n" + response.getBody() + "\n" + response.getStatusCode());
		assertEquals(response.getStatusCode(), 201);

	}

}
