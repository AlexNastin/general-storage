package by.dt.boaopromtorg.entity;

import by.dt.boaopromtorg.entity.dto.PriceDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "Сущность прайс в которой хранится информация о цене в конкретном магазине")
public class Price implements Serializable{


    @ApiModelProperty(value = "ID магазинов")
    private List<String> shopIds;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;

    public Price(PriceDTO priceDTO){
        this.shopIds = priceDTO.getShopIds();
        this.priceUnit = priceDTO.getPriceUnit();
    }
}
