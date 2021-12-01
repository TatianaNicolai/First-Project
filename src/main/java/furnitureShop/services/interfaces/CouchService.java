package furnitureShop.services.interfaces;

import furnitureShop.models.CouchModel;

import java.util.List;

public interface CouchService {

    CouchModel get(Long id);

    CouchModel update(CouchModel couchModel);

    List<CouchModel> getAllModels();

    void delete(CouchModel couchModel);
}
