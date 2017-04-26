package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@ApiModel(value = "Магазин")
@Document(collection = "shop")
public class Shop implements Serializable{

    @Id
    @ApiModelProperty(value = "Уникальный id")
    private String id;

    @ApiModelProperty(value = "Название")
    private String name;

    @ApiModelProperty(value = "Координата X")
    private String coordinateX;

    @ApiModelProperty(value = "Координата Y")
    private String coordinateY;

    @ApiModelProperty(value = "Адресс магазина")
    private String address;

    @ApiModelProperty(value = "id торговой сети")
    private String tradingNetworkId;
}
