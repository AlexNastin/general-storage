package by.dt.userstorage.controller;

import by.dt.userstorage.entity.User;
import by.dt.userstorage.entity.dto.RegistrationDataDTO;
import by.dt.userstorage.entity.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ApiResponses(value = {@ApiResponse(code = 401, message = "Unauthorized", response = ResponseEntity.class)})
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @ApiOperation(value = "Регистрация нового пользователя", notes = "Возвращает созданного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public User userRegistration(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return new User();
    }

    @ApiOperation(value = "Аутентификация пользователя", notes = "Возвращает авторизированного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/authentication", method = RequestMethod.POST)
    public User userAuthentication(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return new User();
    }

    @ApiOperation(value = "Обновление пользователя и пользовательских настроек", notes = "Возвращает статус выполнения", produces = MediaType.TEXT_HTML_VALUE)
    /*@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", ),
            @ApiResponse(code = 404, message = "User not found", response = String.class)})*/
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@RequestBody UserDTO user) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
