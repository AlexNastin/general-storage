package by.dt.userstorage.entity;

import by.dt.userstorage.entity.enums.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Set;

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

    public UserSettings(){}

    public Set<CustomerCard> getCustomerCards() {
        return customerCards;
    }

    public void setCustomerCards(Set<CustomerCard> customerCards) {
        this.customerCards = customerCards;
    }

    public Set<Long> getInterestedTradingNetworkIds() {
        return interestedTradingNetworkIds;
    }

    public void setInterestedTradingNetworkIds(Set<Long> interestedTradingNetworkIds) {
        this.interestedTradingNetworkIds = interestedTradingNetworkIds;
    }

    public boolean isSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    public Location getLocationMode() {
        return locationMode;
    }

    public void setLocationMode(Location locationMode) {
        this.locationMode = locationMode;
    }
}
