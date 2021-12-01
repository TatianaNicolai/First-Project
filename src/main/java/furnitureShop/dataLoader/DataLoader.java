package furnitureShop.dataLoader;

import furnitureShop.models.CabinetModel;
import furnitureShop.models.TableModel;
import furnitureShop.services.impl.CabinetServiceImpl;
import furnitureShop.services.impl.TableServiceImpl;
import furnitureShop.services.interfaces.CabinetService;
import furnitureShop.services.interfaces.TableService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final CabinetService cabinetService;
    private final TableService tableService;

    DataLoader(CabinetServiceImpl cabinetService, TableServiceImpl tableService) {
        this.cabinetService = cabinetService;
        this.tableService = tableService;
    }

    @Override
    public void run(String... args) {
        CabinetModel cabinetOne=new CabinetModel();
        cabinetOne.setColor("red");
        cabinetOne.setManufacturer("IKEA");
        cabinetOne.setModel("office");
        cabinetOne.setSize("120*50");
        cabinetService.save(cabinetOne);

        CabinetModel cabinetTwo=new CabinetModel();
        cabinetTwo.setColor("blue");
        cabinetTwo.setManufacturer("IKEA");
        cabinetTwo.setModel("kitchen");
        cabinetTwo.setSize("100*50");
        cabinetService.save(cabinetTwo);

        CabinetModel cabinetThree=new CabinetModel();
        cabinetThree.setColor("yellow");
        cabinetThree.setManufacturer("IKEA");
        cabinetThree.setModel("ofiiceTwo");
        cabinetThree.setSize("120*60");

        TableModel tableModel1=new TableModel();
        tableModel1.setSize("120*80");
        tableModel1.setColor("white");
        tableModel1.setManufacturer("Tandem");
        tableModel1.setModel("office3");
        tableService.update(tableModel1);

        TableModel tableModel2=new TableModel();
        tableModel2.setSize("100*80");
        tableModel2.setColor("black");
        tableModel2.setManufacturer("Ikea");
        tableModel2.setModel("desk3");
        tableService.update(tableModel2);
    }
}
