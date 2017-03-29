package by.dt.userstorage.service.impl;

import by.dt.userstorage.dao.UserRepository;
import by.dt.userstorage.entity.User;
import by.dt.userstorage.entity.dto.RegistrationDataDTO;
import by.dt.userstorage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(RegistrationDataDTO registrationDataDTO) {
        User user = new User(registrationDataDTO);
        user = userRepository.insert(user);
        return user;
    }

    @Override
    public User userAuthentication(RegistrationDataDTO registrationDataDTO) {
        return userRepository.findUserByLoginAndPassword(registrationDataDTO.getLogin(), registrationDataDTO.getPassword());
    }

    @Override public void updateUser(User user) {
        userRepository.save(user);
    }


}
