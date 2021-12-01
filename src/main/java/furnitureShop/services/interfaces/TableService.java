package furnitureShop.services.interfaces;

import furnitureShop.models.TableModel;

import java.util.List;

public interface TableService {
    TableModel get(Long id);

    TableModel update(TableModel tableModel);

    List<TableModel> getAllModels();

    void delete(TableModel tableModel);
}
