package by.dt.userstorage.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "Карта лояльности пользователя")
public class CustomerCard implements Serializable {

    @ApiModelProperty(value = "Уникальный id карты")
    private Long id;

    @ApiModelProperty(value = "id карты в торговой сети")
    private Long cardId;

    @ApiModelProperty(value = "id торговой сети")
    private Long tradingNetworkId;

    public CustomerCard(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
