package furnitureShop.services.impl;

import furnitureShop.jpaRepositories.TablesJpaRepository;
import furnitureShop.models.TableModel;
import furnitureShop.services.interfaces.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TablesJpaRepository tablesJpaRepository;

    @Override
    public TableModel get(Long id) {
        return tablesJpaRepository.findById(id).orElse(null);
    }

    @Override
    public TableModel update(TableModel tableModel) {
        return tablesJpaRepository.save(tableModel);
    }

    @Override
    public List<TableModel> getAllModels() {
        return tablesJpaRepository.findAll();
    }

    @Override
    public void delete(TableModel tableModel) {
        tablesJpaRepository.delete(tableModel);
    }
}
