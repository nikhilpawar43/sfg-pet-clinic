package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Initiate Loading Bootstrap Data ...");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Harshad");
        owner1.setLastName("Mehta");
        
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Rakesh");
        owner2.setLastName("Jhunjunwala");

        ownerService.save(owner2);

        System.out.println("Owners Loaded ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mukesh");
        vet1.setLastName("Ambani");
        
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Gautam");
        vet2.setLastName("Adani");

        vetService.save(vet2);

        System.out.println("Vets Loaded ...");
    }
}
