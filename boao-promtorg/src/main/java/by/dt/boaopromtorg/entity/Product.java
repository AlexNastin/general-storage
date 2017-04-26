package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "Продукт")
@Document(collection = "product")
public class Product implements Serializable{

    @Id
    @ApiModelProperty(value = "Уникальный ID")
    private String id;

    @ApiModelProperty(value = "Штрих-код")
    private String barcode;

    @ApiModelProperty(value = "Наименование товара")
    private String name;

    @ApiModelProperty(value = "id торговой сети")
    private String tradingNetworkId;

    @ApiModelProperty(value = "Единица измерения")
    private String typeUnit;

    @ApiModelProperty(value = "Производитель")
    private String producer;

    @ApiModelProperty(value = "Страна")
    private String country;

    @ApiModelProperty(value = "Массив объектов, в которых хранится информация о цене в конкретном магазине")
    private List<Price> prices;

    @ApiModelProperty(value = "Категория")
    private String category;

    @ApiModelProperty(value = "Подкатегория")
    private String subCategory;
}
