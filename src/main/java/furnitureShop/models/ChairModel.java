package furnitureShop.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CHAIRS")
public class ChairModel extends AbstractModel {

}
