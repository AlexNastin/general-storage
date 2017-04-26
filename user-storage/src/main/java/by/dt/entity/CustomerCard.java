package by.dt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "Карта лояльности пользователя")
public class CustomerCard implements Serializable {

    @ApiModelProperty(value = "id карты в торговой сети")
    private Long cardId;

    @ApiModelProperty(value = "id торговой сети")
    private Long tradingNetworkId;
}
