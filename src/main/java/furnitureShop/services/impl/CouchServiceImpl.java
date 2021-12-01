package furnitureShop.services.impl;

import furnitureShop.jpaRepositories.CouchesJpaRepository;
import furnitureShop.models.CouchModel;
import furnitureShop.services.interfaces.CouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouchServiceImpl implements CouchService {
    @Autowired
    CouchesJpaRepository couchesJpaRepository;

    @Override
    public CouchModel get(Long id) {
        return couchesJpaRepository.findById(id).orElseThrow(null);
    }

    @Override
    public CouchModel update(CouchModel cabinetModel) {
        return couchesJpaRepository.save(cabinetModel);
    }

    @Override
    public List<CouchModel> getAllModels() {
        return couchesJpaRepository.findAll();
    }

    @Override
    public void delete(CouchModel cabinetModel) {
        couchesJpaRepository.delete(cabinetModel);
    }
}
