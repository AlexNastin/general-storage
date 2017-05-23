package by.dt.web.controller;

import by.dt.entity.Category;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user-storage/v1", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {

    @ApiOperation(value = "Запрос на получение всех категорий", notes = "Возвращает список всех категорий", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        //TODO : Implement logic for getAllCategories
        return null;
    }

    @ApiOperation(value = "Запрос на получение всех главных категорий", notes = "Возвращает список всех главных категорий", produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/mainCategories", method = RequestMethod.GET)
    public List<Category> getMainCategories() {
        //TODO : Implement logic for getMainCategories
        return null;
    }
}
