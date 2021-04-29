package akshitone.springtutorial.petclinic.bootstrap;

import akshitone.springtutorial.petclinic.model.Owner;
import akshitone.springtutorial.petclinic.model.Vet;
import akshitone.springtutorial.petclinic.services.OwnerService;
import akshitone.springtutorial.petclinic.services.VetService;
import akshitone.springtutorial.petclinic.services.map.OwnerServiceMap;
import akshitone.springtutorial.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner lucifer = new Owner();
        lucifer.setId(1L);
        lucifer.setFirstName("Lucifer");
        lucifer.setLastName("Morningstar");
        ownerService.save(lucifer);

        Owner chloe = new Owner();
        chloe.setId(2L);
        chloe.setFirstName("Chloe");
        chloe.setLastName("Decker");
        ownerService.save(chloe);

        System.out.println("Loaded owners data...");

        Vet omen = new Vet();
        omen.setId(1L);
        omen.setFirstName("Omen");
        omen.setLastName("Teleport");
        vetService.save(omen);

        Vet phoenix = new Vet();
        phoenix.setId(2L);
        phoenix.setFirstName("Phoenix");
        phoenix.setLastName("Explosive");
        vetService.save(phoenix);

        System.out.println("Loaded vets data...");
    }
}
