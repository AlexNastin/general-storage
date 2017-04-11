package by.dt.web.controller;

import by.dt.entity.User;
import by.dt.entity.dto.RegistrationDataDTO;
import by.dt.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.required;

@ApiResponses(value = {@ApiResponse(code = 401, message = "Unauthorized", response = ResponseEntity.class)})
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Регистрация нового пользователя", notes = "Возвращает созданного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public User userRegistration(@RequestBody RegistrationDataDTO registrationDataDTO) {
        return userService.addUser(registrationDataDTO);
    }

    @ApiOperation(value = "Аутентификация пользователя", notes = "Возвращает авторизированного пользователя", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/authentication", method = RequestMethod.GET)
    public User userAuthentication(@ApiParam(required = true, value = "Логин пользователя", example = "Ivan_Ivanov")
                                   @RequestParam(required = true, value = "login") String login,
                                   @ApiParam(required = true, value = "Пароль")
                                   @RequestParam(required = true, value = "password") String password) {
        RegistrationDataDTO registrationDataDTO = new RegistrationDataDTO(login, password);
        return userService.userAuthentication(registrationDataDTO);
    }

    @ApiOperation(value = "Обновление пользователя и пользовательских настроек", notes = "Возвращает статус выполнения", produces = MediaType.TEXT_HTML_VALUE)
    /*@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", ),
            @ApiResponse(code = 404, message = "User not found", response = String.class)})*/
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }

}
