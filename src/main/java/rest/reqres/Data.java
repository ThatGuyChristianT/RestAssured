package rest.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    @JsonProperty("id")
    private int id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstname;
    @JsonProperty("last_name")
    private String lastname;
    @JsonProperty("avatar")
    private String avatar;

}
