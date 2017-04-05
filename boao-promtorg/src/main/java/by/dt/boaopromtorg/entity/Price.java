package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@ApiModel(value = "Обьект в котором хранится информация о цене в конкретном магазине")
@Document(collection = "price")
public class Price implements Serializable{

    @Id
    @ApiModelProperty(value = "Уникальный ID")
    private String id;
    @ApiModelProperty(value = "ID магазина")
    private String shopId;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }
}
