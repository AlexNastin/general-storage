package by.dt.service.impl;

import by.dt.dao.UserRepository;
import by.dt.entity.User;
import by.dt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
        userRepository.insert(user);
    }

    @Override public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override public void deleteUserById(Long id) {
        userRepository.delete(id);
    }

}
