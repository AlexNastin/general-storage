package by.dt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ApiModel(value = "Категория товара")
@Document(collection = "category")
public class Category{

    @Id
    @ApiModelProperty(value = "Уникальный id")
    private String id;

    @ApiModelProperty(value = "Имя категории")
    private String name;

    @ApiModelProperty(value = "Id родительской категории")
    private String parentCategoryId;
}
