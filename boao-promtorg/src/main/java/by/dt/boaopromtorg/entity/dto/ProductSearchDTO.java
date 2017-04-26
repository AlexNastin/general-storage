package by.dt.boaopromtorg.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@ApiModel(value = "Продукт DTO", description = "Параметры фильтра поиска продуктов")
public class ProductSearchDTO implements Serializable {

    @ApiModelProperty(value = "Наименование товара")
    private String name;

    @ApiModelProperty(value = "Категория")
    private String category;

    @ApiModelProperty(value = "Подкатегория")
    private String subCategory;

    @ApiModelProperty(value = "Цена 'От'")
    private Double priceFrom;

    @ApiModelProperty(value = "Цена 'До'")
    private Double priceTo;
}
