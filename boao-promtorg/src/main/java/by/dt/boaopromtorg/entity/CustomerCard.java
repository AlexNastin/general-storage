package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@ApiModel(value = "Карта лояльности пользователя")
@Document(collection = "customerCard")
public class CustomerCard implements Serializable {

    @Id
    @ApiModelProperty(value = "Уникальный id карты")
    private String id;

    @ApiModelProperty(value = "id карты в торговой сети")
    private Long cardId;

    @ApiModelProperty(value = "id торговой сети")
    private Long tradingNetworkId;

    public CustomerCard(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
