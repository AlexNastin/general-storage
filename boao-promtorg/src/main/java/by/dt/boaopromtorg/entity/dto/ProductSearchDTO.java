package by.dt.boaopromtorg.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

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

    public ProductSearchDTO() {
    }

    public ProductSearchDTO(String name, String category, String subCategory, Double priceFrom, Double priceTo) {
        this.name = name;
        this.category = category;
        this.subCategory = subCategory;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Double priceFrom) {
        this.priceFrom = priceFrom;
    }

    public Double getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(Double priceTo) {
        this.priceTo = priceTo;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
