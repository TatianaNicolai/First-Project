package furnitureShop.jpaRepositories;

import furnitureShop.models.ChairModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairsJpaRepository extends JpaRepository<ChairModel, Long> {
}
