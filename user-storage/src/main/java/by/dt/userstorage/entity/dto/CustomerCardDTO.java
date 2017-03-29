package by.dt.userstorage.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Карта лояльности пользователя DTO")
public class CustomerCardDTO implements Serializable {

    @ApiModelProperty(value = "id карты в торговой сети")
    private Long cardId;

    @ApiModelProperty(value = "id торговой сети")
    private Long tradingNetworkId;

    public CustomerCardDTO(){}

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getTradingNetworkId() {
        return tradingNetworkId;
    }

    public void setTradingNetworkId(Long tradingNetworkId) {
        this.tradingNetworkId = tradingNetworkId;
    }
}
