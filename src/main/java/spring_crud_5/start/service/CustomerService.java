package spring_crud_5.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_crud_5.start.entity.Customer;
import spring_crud_5.start.repo.CustomerRepo;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepo repo;

    public Customer save(Customer c){
        return repo.save(c);
    }

    public List<Customer> getAllCustomers(){
        return repo.findAll();
    }

    public void getCostumerByID(int id){
        repo.findById(id);
    }

    public void deleteByID(int id){
        repo.deleteById(id);
    }

    

}
