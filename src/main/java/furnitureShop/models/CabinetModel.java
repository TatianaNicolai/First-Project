package furnitureShop.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cabinets")
public class CabinetModel extends AbstractModel {

    @Column(name = "size_L_H")
    private String size;
}
