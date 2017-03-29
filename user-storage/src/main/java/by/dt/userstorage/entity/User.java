package by.dt.userstorage.entity;

import by.dt.userstorage.entity.dto.RegistrationDataDTO;
import by.dt.userstorage.entity.enums.Gender;
import by.dt.userstorage.service.LocalDateDeserializer;
import by.dt.userstorage.service.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDate;

@ApiModel(value = "Пользователь DTO", description = "Обьект пользователя, включающий пользовательские настройки")
public class User implements Serializable {

    @Id
    @ApiModelProperty(value = "Уникальный id")
    private Long id;

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

    public User() {
    }

    public User(RegistrationDataDTO registrationDataDTO){
        this.login = registrationDataDTO.getLogin();
        this.password = registrationDataDTO.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }
}
