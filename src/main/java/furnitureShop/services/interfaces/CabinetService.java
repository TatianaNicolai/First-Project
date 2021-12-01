package furnitureShop.services.interfaces;

import furnitureShop.models.CabinetModel;

import java.util.List;

public interface CabinetService {
    CabinetModel get(Long id);

    CabinetModel update(CabinetModel cabinetModel);

    List<CabinetModel> getAllModels();

    void delete(CabinetModel cabinetModel);
    void save(CabinetModel cabinetModel);
}
