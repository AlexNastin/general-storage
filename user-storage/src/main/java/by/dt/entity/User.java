package by.dt.entity;

import by.dt.entity.dto.RegistrationDataDTO;
import by.dt.entity.enums.Gender;
import by.dt.service.LocalDateDeserializer;
import by.dt.service.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@ApiModel(value = "Пользователь DTO", description = "Обьект пользователя, включающий пользовательские настройки")
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

    @ApiModelProperty(value = "Имя пользователя", example = "Иван")
    private String name;

    @ApiModelProperty(value = "Фамилия пользователя", example = "Иванов")
    private String surname;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @ApiModelProperty(value = "Дата рождения")
    private LocalDate birthday;

    @ApiModelProperty(value = "Пол")
    private Gender gender;

    @ApiModelProperty(value = "Адрес почты", example = "Ivan_Ivanov@gmail.com")
    private String email;

    @ApiModelProperty(value = "Номер телефона", example = "375291234567")
    private String numberPhone;

    @ApiModelProperty(value = "Координата X", example = "53.875114")
    private String coordinateX;

    @ApiModelProperty(value = "Координата Y", example = "27.498202")
    private String coordinateY;

    @ApiModelProperty(value = "Пользовательские настройки")
    private UserSettings userSettings;

    public User(RegistrationDataDTO registrationDataDTO){
        this.login = registrationDataDTO.getLogin();
        this.password = registrationDataDTO.getPassword();
    }
}
