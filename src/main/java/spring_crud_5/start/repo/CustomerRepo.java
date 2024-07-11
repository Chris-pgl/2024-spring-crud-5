package spring_crud_5.start.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring_crud_5.start.entity.Customer;

@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Integer>{
    
}
