package ohteproject.co2emissionsapi.repository;

import ohteproject.co2emissionsapi.domain.Co2emission;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Co2emissionRepository extends CrudRepository<Co2emission,Long> {

    Iterable<Co2emission> findAllByCountry(String country);

}
