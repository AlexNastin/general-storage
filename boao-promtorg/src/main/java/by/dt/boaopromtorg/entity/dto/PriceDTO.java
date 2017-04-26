package by.dt.boaopromtorg.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "Сущность необходимая для обновления прайсов")
public class PriceDTO implements Serializable{

    @ApiModelProperty(value = "ID магазинов")
    private List<String> shopIds;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;
    @ApiModelProperty(value = "Штрих-код товара")
    private String barcode;
}
