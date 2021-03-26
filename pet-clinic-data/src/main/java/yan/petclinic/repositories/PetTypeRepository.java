package yan.petclinic.repositories;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.data.repository.CrudRepository;
import yan.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
