package by.dt.userstorage.service.impl;

import by.dt.userstorage.controller.exception.UserAlreadyExistException;
import by.dt.userstorage.controller.exception.UserNotFoundException;
import by.dt.userstorage.dao.UserRepository;
import by.dt.userstorage.entity.User;
import by.dt.userstorage.entity.dto.RegistrationDataDTO;
import by.dt.userstorage.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(RegistrationDataDTO registrationDataDTO) {
        User user = userRepository.findUserByLogin(registrationDataDTO.getLogin());
        if(user != null){
            throw new UserAlreadyExistException("User with same login is already exist");
        }
        user = new User(registrationDataDTO);
        ObjectId objectId = new ObjectId();
        user.setId(objectId.toString());
        user = userRepository.insert(user);
        return user;
    }

    @Override
    public User userAuthentication(RegistrationDataDTO registrationDataDTO) {
        User user = userRepository.findUserByLoginAndPassword(registrationDataDTO.getLogin(), registrationDataDTO.getPassword());
        if(user == null){
            throw new UserNotFoundException("User not found");
        }
        return userRepository.findUserByLoginAndPassword(registrationDataDTO.getLogin(), registrationDataDTO.getPassword());
    }

    @Override public void updateUser(User user) {
        userRepository.save(user);
    }


}
