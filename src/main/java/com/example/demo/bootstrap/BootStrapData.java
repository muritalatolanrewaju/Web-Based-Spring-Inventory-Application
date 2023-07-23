package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Only populate if repositories are empty
        if (partRepository.count() == 0 && productRepository.count() == 0) {
            // Product data
            Product BudgetPC = new Product("Budget PC",500.0,35);
            Product HomeOfficePC = new Product("Home Office PC",800.0,26);
            Product GamingPC = new Product("Gaming PC",1000.0,22);
            Product GraphicDesignPC = new Product("Graphic Design PC",1200.0,18);
            Product HighEndWorkstationPC = new Product("High End Workstation PC",1500.0,15);

            // Save the products in the repository
            productRepository.save(BudgetPC);
            productRepository.save(HomeOfficePC);
            productRepository.save(GamingPC);
            productRepository.save(GraphicDesignPC);
            productRepository.save(HighEndWorkstationPC);

            // Part data
            InhousePart cpu = new InhousePart("Central Processing Unit", 190.0, 100, 1000, 50);
            InhousePart gpu = new InhousePart("Graphics Processing Unit", 600.0, 106, 1000, 50);
            InhousePart ram = new InhousePart("Random Access Memory", 120.0, 202, 1000, 50);
            InhousePart ssd = new InhousePart("Solid State Drive", 200.0, 106, 1000, 50);
            InhousePart psu = new InhousePart("Power Supply Unit", 100.0, 300, 1000, 50);

            // Save the part in the repository
            partRepository.save(cpu);
            partRepository.save(gpu);
            partRepository.save(ram);
            partRepository.save(ssd);
            partRepository.save(psu);

            // Set the parts for each product
            BudgetPC.setParts(Set.of(cpu, ram));
            HomeOfficePC.setParts(Set.of(cpu, ram, ssd));
            GamingPC.setParts(Set.of(cpu, ram, gpu));
            GraphicDesignPC.setParts(Set.of(cpu, ram, gpu, ssd));
            HighEndWorkstationPC.setParts(Set.of(cpu, ram, gpu, ssd, psu));
        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
