package by.dt.entity;

import by.dt.entity.enums.Gender;
import by.dt.service.LocalDateDeserializer;
import by.dt.service.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Document(collection = "user")
public class User implements Serializable{

    @Id
    private Long id;
    private String name;
    private String surname;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birthday;
    private Gender gender;
    private String email;
    private String numberPhone;
    private String coordinateX;
    private String coordinateY;
    private Set<Long> customerCards;

    public User(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Long> getCustomerCards() {
        return customerCards;
    }

    public void setCustomerCards(Set<Long> customerCards) {
        this.customerCards = customerCards;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null)
            return false;
        if (name != null ? !name.equals(user.name) : user.name != null)
            return false;
        if (surname != null ? !surname.equals(user.surname) : user.surname != null)
            return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null)
            return false;
        if (gender != user.gender)
            return false;
        if (email != null ? !email.equals(user.email) : user.email != null)
            return false;
        if (numberPhone != null ? !numberPhone.equals(user.numberPhone) : user.numberPhone != null)
            return false;
        if (coordinateX != null ? !coordinateX.equals(user.coordinateX) : user.coordinateX != null)
            return false;
        if (coordinateY != null ? !coordinateY.equals(user.coordinateY) : user.coordinateY != null)
            return false;
        return customerCards != null ? customerCards.equals(user.customerCards) : user.customerCards == null;
    }

    @Override public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (numberPhone != null ? numberPhone.hashCode() : 0);
        result = 31 * result + (coordinateX != null ? coordinateX.hashCode() : 0);
        result = 31 * result + (coordinateY != null ? coordinateY.hashCode() : 0);
        result = 31 * result + (customerCards != null ? customerCards.hashCode() : 0);
        return result;
    }
}
