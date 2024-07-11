package spring_crud_5.start.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring_crud_5.start.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    
}
