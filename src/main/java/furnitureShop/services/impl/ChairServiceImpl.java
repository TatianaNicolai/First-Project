package furnitureShop.services.impl;

import furnitureShop.jpaRepositories.ChairsJpaRepository;
import furnitureShop.models.ChairModel;
import furnitureShop.services.interfaces.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChairServiceImpl implements ChairService {
    @Autowired
    ChairsJpaRepository chairsJpaRepository;

    @Override
    public ChairModel get(Long id) {
        return chairsJpaRepository.findById(id).orElseThrow(null);
    }

    @Override
    public ChairModel update(ChairModel cabinetModel) {
        return chairsJpaRepository.save(cabinetModel);
    }

    @Override
    public List<ChairModel> getAllModels() {
        return chairsJpaRepository.findAll();
    }

    @Override
    public void delete(ChairModel cabinetModel) {
        chairsJpaRepository.delete(cabinetModel);
    }
}
