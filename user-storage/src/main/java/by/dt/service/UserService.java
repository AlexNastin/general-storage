package by.dt.service;

import by.dt.entity.User;
import by.dt.entity.dto.RegistrationDataDTO;

import java.util.List;

public interface UserService {

    User addUser(RegistrationDataDTO registrationDataDTO);
    User userAuthentication(RegistrationDataDTO registrationDataDTO);
    void updateInterestedTradingNetworks(List<String> interestedTradingNetworksIds, String id);

}
