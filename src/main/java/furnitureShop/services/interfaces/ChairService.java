package furnitureShop.services.interfaces;

import furnitureShop.models.ChairModel;

import java.util.List;

public interface ChairService {
    ChairModel get(Long id);

    ChairModel update(ChairModel chairModel);

    List<ChairModel> getAllModels();

    void delete(ChairModel chairModel);
}
