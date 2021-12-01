package furnitureShop.controllers;

import furnitureShop.models.CabinetModel;
import furnitureShop.services.interfaces.CabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class CabinetsController {
    @Autowired
    CabinetService cabinetService;
    Logger log = Logger.getAnonymousLogger();

    @GetMapping("/cabinet/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        CabinetModel cabinetModel = null;
        try {
            cabinetModel = cabinetService.get(id);
            return ResponseEntity.ok().body(cabinetModel);
        } catch (NullPointerException e) {
            log.info("Cabinet with id: " + id + " not exists");
            return ResponseEntity.badRequest().body("Cabinet with id: " + id + " not exists");

        }
    }

    @GetMapping("/cabinets")
    public ResponseEntity<List<CabinetModel>> list() {
        List<CabinetModel> cellphones = cabinetService.getAllModels();
        return ResponseEntity.ok().body(cellphones);
    }

    @PostMapping("/cabinet")
    public ResponseEntity<?> save(@RequestBody CabinetModel cabinetModel) {
        cabinetService.update(cabinetModel);
        return ResponseEntity.ok().body(cabinetModel);
    }

    @PutMapping("/cabinet/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody CabinetModel cabinetModel) {
        CabinetModel cabinetModel1 = cabinetService.get(id);
        if (cabinetModel1 == null) {
            return ResponseEntity.badRequest().body("Cellphone with id " + id + " has not been found.");
        }
        cabinetModel1.setSize(cabinetModel.getSize());
        cabinetModel1.setModel(cabinetModel.getModel());
        cabinetModel1.setManufacturer(cabinetModel.getManufacturer());
        cabinetModel1.setColor(cabinetModel.getColor());

        cabinetService.update(cabinetModel);
        return ResponseEntity.ok().body(cabinetModel);
    }

    @DeleteMapping("/cabinet/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        CabinetModel exictingCabinet = cabinetService.get(id);
        if (exictingCabinet == null) {
            return ResponseEntity.badRequest().body("Cabinet with id " + id + " has not been found.");
        }
        cabinetService.delete(exictingCabinet);
        return ResponseEntity.ok().body("Cabinet has been deleted successfully.");
    }


}
