package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

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
    @DBRef
    private List<Price> prices;

    @ApiModelProperty(value = "Категория")
    private String category;

    public Product(){}

    public void setId(String id){
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTradingNetworkId() {
        return tradingNetworkId;
    }

    public void setTradingNetworkId(String tradingNetworkId) {
        this.tradingNetworkId = tradingNetworkId;
    }

    public String getTypeUnit() {
        return typeUnit;
    }

    public void setTypeUnit(String typeUnit) {
        this.typeUnit = typeUnit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
