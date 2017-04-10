package by.dt.boaopromtorg.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "Сущность необходимая для обновления прайсов")
public class PriceDTO implements Serializable{

    @ApiModelProperty(value = "ID магазинов")
    private List<String> shopIds;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;
    @ApiModelProperty(value = "Штрих-код товара")
    private String barcode;

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

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
