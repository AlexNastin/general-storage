package by.dt.boaopromtorg.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@ApiModel(value = "Магазин")
@Document(collection = "shop")
public class Shop implements Serializable{

    @Id
    @ApiModelProperty(value = "Уникальный id")
    private Long id;

    @ApiModelProperty(value = "Название")
    private String name;

    @ApiModelProperty(value = "Координата X")
    private String coordinateX;

    @ApiModelProperty(value = "Координата Y")
    private String coordinateY;

    public Shop(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(String coordinateX) {
        this.coordinateX = coordinateX;
    }

    public String getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(String coordinateY) {
        this.coordinateY = coordinateY;
    }
}
