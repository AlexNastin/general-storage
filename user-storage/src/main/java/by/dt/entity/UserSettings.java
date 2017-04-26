package by.dt.entity;

import by.dt.entity.enums.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@ApiModel(value = "Пользовательские настройки")
public class UserSettings implements Serializable{

    @ApiModelProperty(value = "Список карт лоялностей пользователя")
    private Set<CustomerCard> customerCards;

    @ApiModelProperty(value = "Список id интересующих пользователя торговых сетей")
    private Set<Long> interestedTradingNetworkIds;

    @ApiModelProperty(value = "Флаг нужно ли посылать пользователю уведомления")
    private boolean sendNotification;

    @ApiModelProperty(value = "У казывает на локацию от которой осуществлять поиск. От домашнего адреса или от текущей локации")
    private Location locationMode;
}
