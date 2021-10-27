package kitchenstory.kitchenstory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kitchenstory.kitchenstory.entity.Order;

@Repository
public interface PurchaseRepository extends JpaRepository<Order, Integer>{

}
