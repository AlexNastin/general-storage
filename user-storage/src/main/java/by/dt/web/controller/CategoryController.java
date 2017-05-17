package by.dt.web.controller;

import by.dt.entity.Category;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @ApiOperation(value = "Запрос на получение всех категорий", notes = "Возвращает список всех категорий", produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(path = "/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getAllCategories() {
        //TODO : Implement logic for getAllCategories
        return null;
    }
}
