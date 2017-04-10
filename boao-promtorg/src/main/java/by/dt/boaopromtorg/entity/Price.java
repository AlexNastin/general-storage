package by.dt.boaopromtorg.entity;

import by.dt.boaopromtorg.entity.dto.PriceDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "Сущность прайс в которой хранится информация о цене в конкретном магазине")
public class Price implements Serializable{


    @ApiModelProperty(value = "ID магазинов")
    private List<String> shopIds;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;

    public Price (){}

    public Price(PriceDTO priceDTO){
        this.shopIds = priceDTO.getShopIds();
        this.priceUnit = priceDTO.getPriceUnit();
    }

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public Double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Double priceUnit) {
        this.priceUnit = priceUnit;
    }
}
