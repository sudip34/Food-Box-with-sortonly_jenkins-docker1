package kitchenstory.kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kitchenstory.kitchenstory.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
