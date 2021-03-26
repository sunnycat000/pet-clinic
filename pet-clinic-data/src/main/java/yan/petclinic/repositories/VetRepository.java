package yan.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import yan.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
