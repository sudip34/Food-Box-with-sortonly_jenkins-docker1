package kitchenstory.kitchenstory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kitchenstory.kitchenstory.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	List<State> findByCountryId(int countryId);

}
