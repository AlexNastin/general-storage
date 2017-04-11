package by.dt.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Регистрационные данные DTO", description = "Данные о пользователе в момент регистрации или авторизации")
public class RegistrationDataDTO implements Serializable{

    @ApiModelProperty(value = "Логин", required = true, example = "Ivan_Ivanov")
    @JsonProperty(required = true)
    private String login;

    @ApiModelProperty(value = "Пароль", required = true)
    @JsonProperty(required = true)
    private String password;

    public RegistrationDataDTO(){}

    public RegistrationDataDTO(String login, String password) {
        this.login = login;
        this.password = password;
    }

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
