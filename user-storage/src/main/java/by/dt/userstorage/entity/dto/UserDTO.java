package by.dt.userstorage.entity.dto;

import by.dt.userstorage.entity.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Пользователь DTO", description = "Данные о пользователе в момент изменения настроек")
public class UserDTO implements Serializable {

    @JsonProperty(required = true)
    @ApiModelProperty(value = "Логин", required = true, example = "Ivan_Ivanov")
    private String login;

    @ApiModelProperty(value = "Имя пользователя", example = "Иван")
    private String name;

    @ApiModelProperty(value = "Фамилия пользователя", example = "Иванов")
    private String surname;

    @ApiModelProperty(value = "Дата рождения")
    private String birthday;

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
    private UserSettingsDTO userSettings;

    public UserDTO() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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

    public UserSettingsDTO getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettingsDTO userSettings) {
        this.userSettings = userSettings;
    }
}
