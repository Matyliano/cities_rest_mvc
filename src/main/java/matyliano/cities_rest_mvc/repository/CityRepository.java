package matyliano.cities_rest_mvc.repository;

import matyliano.cities_rest_mvc.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
