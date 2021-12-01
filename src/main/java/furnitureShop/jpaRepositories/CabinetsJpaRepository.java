package furnitureShop.jpaRepositories;

import furnitureShop.models.CabinetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinetsJpaRepository extends JpaRepository<CabinetModel,Long> {
}
