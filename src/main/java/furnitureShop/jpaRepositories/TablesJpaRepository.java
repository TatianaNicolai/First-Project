package furnitureShop.jpaRepositories;

import furnitureShop.models.TableModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablesJpaRepository extends JpaRepository<TableModel, Long> {
}
