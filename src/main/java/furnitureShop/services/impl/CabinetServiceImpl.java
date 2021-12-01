package furnitureShop.services.impl;

import furnitureShop.jpaRepositories.CabinetsJpaRepository;
import furnitureShop.models.CabinetModel;
import furnitureShop.services.interfaces.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetServiceImpl implements CabinetService {
    @Autowired
    CabinetsJpaRepository cabinetsJpaRepository;

    @Override
    public CabinetModel get(Long id) {
        return cabinetsJpaRepository.findById(id).orElse(null);
    }

    @Override
    public CabinetModel update(CabinetModel cabinetModel) {
        return cabinetsJpaRepository.save(cabinetModel);
    }

    @Override
    public List<CabinetModel> getAllModels() {
        return cabinetsJpaRepository.findAll();
    }

    @Override
    public void delete(CabinetModel cabinetModel) {
        cabinetsJpaRepository.delete(cabinetModel);
    }

    @Override
    public void save(CabinetModel cabinetModel) {
        cabinetsJpaRepository.save(cabinetModel);
    }
}
