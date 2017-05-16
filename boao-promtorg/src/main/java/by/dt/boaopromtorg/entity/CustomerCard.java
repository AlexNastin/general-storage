package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@ApiModel(value = "Карта лояльности пользователя")
@Document(collection = "customerCard")
public class CustomerCard implements Serializable {

    @Id
    @ApiModelProperty(value = "Уникальный id карты")
    private String id;

    @ApiModelProperty(value = "id карты в торговой сети")
    private String cardId;

    @ApiModelProperty(value = "id торговой сети")
    private String tradingNetworkId;

}
