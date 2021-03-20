package yan.petclinic.services;

import yan.petclinic.model.Owner;
import yan.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner pet);
    Set<Pet> findAll();
}
