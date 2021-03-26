package yan.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import yan.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
