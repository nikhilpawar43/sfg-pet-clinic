package guru.springframework.sfgpetclinic.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
    
}
