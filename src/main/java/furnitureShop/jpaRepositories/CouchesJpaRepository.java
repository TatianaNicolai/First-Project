package furnitureShop.jpaRepositories;

import furnitureShop.models.CouchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouchesJpaRepository extends JpaRepository<CouchModel, Long> {
}
