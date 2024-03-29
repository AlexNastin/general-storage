package by.dt.service;

import by.dt.entity.Notification;
import by.dt.entity.PersonalInformation;
import by.dt.entity.User;
import by.dt.entity.dto.RegistrationDataDTO;

import java.util.List;

public interface UserService {

    User addUser(RegistrationDataDTO registrationDataDTO);
    User userAuthentication(RegistrationDataDTO registrationDataDTO);
    void updateFavoriteTradingNetworks(List<String> favoriteTradingNetworksIds, String id);
    List<String> getFavoriteTradingNetworks(String id);
    List<String> getFavoriteCategories(String id);
    void updatePersonalInformation(PersonalInformation personalInformation, String id);
    Notification getNotificationSettings(String id);
    void updateNotificationSettings(Notification notification, String id);
}
