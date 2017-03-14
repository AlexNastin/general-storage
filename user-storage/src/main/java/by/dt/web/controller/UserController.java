package by.dt.web.controller;

import by.dt.entity.User;
import by.dt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser( @RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteUserById(@PathVariable("id") Long id){
        userService.deleteUserById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

}
