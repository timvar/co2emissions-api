package ohteproject.co2emissionsapi.repository;

import ohteproject.co2emissionsapi.domain.Population;
import org.springframework.data.repository.CrudRepository;

/**
 * Population CRUD
 */

public interface PopulationRepository extends CrudRepository<Population, Long> {

    Iterable<Population> findAllByCountry(String country);

}
