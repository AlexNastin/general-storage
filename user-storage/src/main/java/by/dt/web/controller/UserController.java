package by.dt.web.controller;

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
@RequestMapping(path = "/user-storage/v1/user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Регистрация нового пользователя", notes = "Возвращает созданного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public User userRegistration(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return userService.addUser(registrationDataDTO);
    }

    @ApiOperation(value = "Аутентификация пользователя", notes = "Возвращает авторизированного пользователя", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/authentication", method = RequestMethod.POST)
    public User userAuthentication(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return userService.userAuthentication(registrationDataDTO);
    }

    @ApiOperation(value = "Обновление всех пользовательских настроек", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/{id}/settings", method = RequestMethod.PUT)
    public ResponseEntity updateUserSettings(@RequestBody UserSettings userSettings, @PathVariable(value = "id") String id) {
        //TODO : updateUserSettings
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Обновление предпочитаемых категорий", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/{id}/settings/interestedCategories", method = RequestMethod.PUT)
    public ResponseEntity updateInterestedCategories(@RequestBody List<String> interestedCategoryIds, @PathVariable(value = "id") String id) {
        //TODO : updateUserSettings
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Обновление предпочитаемых торговых сетей", notes = "Возвращает статус выполнения", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/{id}/settings/interestedTradingNetworks", method = RequestMethod.PUT)
    public ResponseEntity updateInterestedTradingNetworks(@RequestBody List<String> interestedTradingNetworksIds, @PathVariable(value = "id") String id) {
        userService.updateInterestedTradingNetworks(interestedTradingNetworksIds, id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
