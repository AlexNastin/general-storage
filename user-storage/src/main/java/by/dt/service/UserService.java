package by.dt.service;

import by.dt.entity.User;

public interface UserService {

    void addUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUserById(Long id);
}
