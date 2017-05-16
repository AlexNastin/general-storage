package by.dt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("Настройки уведомлений")
public class Notification implements Serializable{

    @ApiModelProperty(value = "Флаг нужно ли посылать пользователю уведомления")
    private boolean sendNotification;

    @ApiModelProperty(value = "Флаг нужно ли посылать push уведомления")
    private boolean sendPush;

    @ApiModelProperty(value = "Флаг нужно ли посылать уведомления на почту")
    private boolean sendEmail;

    @ApiModelProperty(value = "Флаг нужно ли посылать sms уведомления")
    private boolean sendSMS;
}
