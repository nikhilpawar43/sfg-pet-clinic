package guru.springframework.sfgpetclinic.service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
    
    Owner findByLastName(String lastName);
    
    Owner findById(Long id);
    
    Set<Owner> findAll();
    
    Owner save(Owner owner);
    
}
