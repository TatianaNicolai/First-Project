package furnitureShop.models;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class AbstractModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "manufacturer")
    private String manufacturer;
}
