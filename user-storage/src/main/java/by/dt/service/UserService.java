package by.dt.service;

import by.dt.entity.User;
import by.dt.entity.dto.RegistrationDataDTO;

public interface UserService {

    User addUser(RegistrationDataDTO registrationDataDTO);
    User userAuthentication(RegistrationDataDTO registrationDataDTO);
    void updateUser(User user);

}
