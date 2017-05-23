package by.dt.entity;

import by.dt.entity.dto.RegistrationDataDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@ApiModel(value = "Пользователь")
@Document(collection = "user")
public class User implements Serializable {

    @Id
    @ApiModelProperty(value = "Уникальный id")
    private String id;

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Логин", required = true, example = "Ivan_Ivanov")
    private String login;

    @ApiModelProperty(value = "Пароль")
    private String password;

    @ApiModelProperty(value = "Персональные данные пользователя")
    private PersonalSettings personalSettings;

    @ApiModelProperty(value = "Пользовательские настройки")
    private UserSettings userSettings;

    public User(RegistrationDataDTO registrationDataDTO){
        this.login = registrationDataDTO.getLogin();
        this.password = registrationDataDTO.getPassword();
        this.personalSettings = new PersonalSettings();
        this.userSettings = new UserSettings();
    }
}
