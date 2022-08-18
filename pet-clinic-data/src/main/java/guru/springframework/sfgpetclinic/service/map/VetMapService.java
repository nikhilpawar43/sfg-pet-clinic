package guru.springframework.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    
    @Override
    public Set<Vet> findAll() {
        return super.findAll(); 
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
