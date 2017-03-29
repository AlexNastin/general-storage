package by.dt.userstorage.service;

import by.dt.userstorage.entity.User;
import by.dt.userstorage.entity.dto.RegistrationDataDTO;

public interface UserService {

    User addUser(RegistrationDataDTO registrationDataDTO);
    User userAuthentication(RegistrationDataDTO registrationDataDTO);
    void updateUser(User user);

}
