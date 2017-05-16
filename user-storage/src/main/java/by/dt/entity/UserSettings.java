package by.dt.entity;

import by.dt.entity.enums.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "Пользовательские настройки")
public class UserSettings implements Serializable{

    @ApiModelProperty(value = "Список id карт лоялностей пользователя")
    private List<String> customerCards;

    @ApiModelProperty(value = "Список id интересующих пользователя торговых сетей")
    private List<String> interestedTradingNetworkIds;

    @ApiModelProperty(value = "Настройки уведомлений")
    private Notification notification;

    @ApiModelProperty(value = "Список id предпочитаемых категорий")
    private List<Category> interestedCategories;

    @ApiModelProperty(value = "У казывает на локацию от которой осуществлять поиск. От домашнего адреса или от текущей локации")
    private Location locationMode;
}
