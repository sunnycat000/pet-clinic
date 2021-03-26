package yan.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import yan.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
