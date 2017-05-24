package by.dt.web.controller;

import by.dt.entity.PersonalInformation;
import by.dt.entity.User;
import by.dt.entity.UserSettings;
import by.dt.entity.dto.RegistrationDataDTO;
import by.dt.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponses(value = {@ApiResponse(code = 401, message = "Unauthorized", response = ResponseEntity.class)})
@RestController
@RequestMapping(path = "/user-storage/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Регистрация нового пользователя", notes = "Возвращает созданного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User userRegistration(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return userService.addUser(registrationDataDTO);
    }

    @ApiOperation(value = "Аутентификация пользователя", notes = "Возвращает авторизированного пользователя", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/authentication", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User userAuthentication(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return userService.userAuthentication(registrationDataDTO);
    }

    @ApiOperation(value = "Обновление всех пользовательских настроек", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateUserSettings(@RequestBody UserSettings userSettings, @PathVariable(value = "id") String id) {
        //TODO : updateUserSettings
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Обновление предпочитаемых категорий", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteCategories", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFavoriteCategories(@RequestBody List<String> favoriteCategoryIds, @PathVariable(value = "id") String id) {
        //TODO : updateUserSettings
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Получение предпочитаемых категорий", notes = "Возвращает предпочитаемые категориb", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteCategories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getFavoriteCategories(@PathVariable(value = "id") String id) {
        return userService.getFavoriteCategories(id);
    }

    @ApiOperation(value = "Обновление предпочитаемых торговых сетей", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteTradingNetworks", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateFavoriteTradingNetworks(@RequestBody List<String> favoriteTradingNetworksIds, @PathVariable(value = "id") String id) {
        userService.updateFavoriteTradingNetworks(favoriteTradingNetworksIds, id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Получение предпочитаемых торговых сетей", notes = "Возвращает предпочитаемые торговые сети", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/settings/favoriteTradingNetworks", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getFavoriteTradingNetworks(@PathVariable(value = "id") String id) {
        return userService.getFavoriteTradingNetworks(id);
    }

    @ApiOperation(value = "Обновление персональных данных пользователя", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/{id}/personalInformation", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updatePersonalInformation(@RequestBody PersonalInformation personalInformation, @PathVariable(value = "id") String id) {
        userService.updatePersonalInformation(personalInformation, id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
