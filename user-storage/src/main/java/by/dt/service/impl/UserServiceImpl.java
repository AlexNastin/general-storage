package by.dt.service.impl;

import by.dt.entity.Notification;
import by.dt.entity.PersonalInformation;
import by.dt.entity.User;
import by.dt.entity.dto.RegistrationDataDTO;
import by.dt.repository.UserRepository;
import by.dt.service.UserService;
import by.dt.web.controller.exception.AlreadyExistException;
import by.dt.web.controller.exception.NotFoundException;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(RegistrationDataDTO registrationDataDTO) {
        User user = userRepository.findUserByLogin(registrationDataDTO.getLogin());
        if(user != null){
            throw new AlreadyExistException("User with same login is already exist");
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
            throw new NotFoundException("User not found");
        }
        return userRepository.findUserByLoginAndPassword(registrationDataDTO.getLogin(), registrationDataDTO.getPassword());
    }

    @Override
    public void updateFavoriteTradingNetworks(List<String> favoriteTradingNetworksIds, String id) {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new NotFoundException("User not found");
        }
        user.getUserSettings().setFavoriteTradingNetworkIds(favoriteTradingNetworksIds);
        userRepository.save(user);
    }

    @Override
    public List<String> getFavoriteTradingNetworks(String id) {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new NotFoundException("User not found");
        }
        return user.getUserSettings().getFavoriteTradingNetworkIds();
    }

    @Override public List<String> getFavoriteCategories(String id) {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new NotFoundException("User not found");
        }
        return user.getUserSettings().getFavoriteCategoryIds();
    }

    @Override public void updatePersonalInformation(PersonalInformation personalInformation, String id) {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new NotFoundException("User not found");
        }
        user.setPersonalInformation(personalInformation);
        userRepository.save(user);
    }

    @Override public Notification getNotificationSettings(String id) {
        User user = userRepository.findOne(id);
        if(user == null){
            throw new NotFoundException("User not found");
        }
        return user.getUserSettings().getNotification();
    }

}
