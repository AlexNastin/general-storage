package by.dt.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "Регистрационные данные DTO", description = "Данные о пользователе в момент регистрации или авторизации")
public class RegistrationDataDTO implements Serializable{

    @ApiModelProperty(value = "Логин", required = true, example = "Ivan_Ivanov")
    @JsonProperty(required = true)
    private String login;

    @ApiModelProperty(value = "Пароль", required = true)
    @JsonProperty(required = true)
    private String password;
}
