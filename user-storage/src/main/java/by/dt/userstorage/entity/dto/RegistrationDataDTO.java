package by.dt.userstorage.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class RegistrationDataDTO implements Serializable{

    @JsonProperty(required = true)
    private String login;

    @JsonProperty(required = true)
    private String password;

    public RegistrationDataDTO(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
