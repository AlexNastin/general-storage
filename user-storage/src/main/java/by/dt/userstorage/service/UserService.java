package by.dt.userstorage.service;

import by.dt.userstorage.entity.User;

public interface UserService {

    void addUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUserById(Long id);
}
