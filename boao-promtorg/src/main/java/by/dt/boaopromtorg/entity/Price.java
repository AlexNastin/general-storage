package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "price")
public class Price implements Serializable{

    @Id
    private String id;
    private String shopId;
    @ApiModelProperty(value = "Цена за единицу товара")
    private Double priceUnit;
}
