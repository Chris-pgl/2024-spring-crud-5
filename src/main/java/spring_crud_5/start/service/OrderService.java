package spring_crud_5.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_crud_5.start.entity.Order;
import spring_crud_5.start.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    OrderRepo repo;


    public Order save(Order o){
        return repo.save(o);
    }

    public List<Order> getAllOrder(){
        return repo.findAll();
    }

    public void getOrderByID(int id){
        repo.findById(id).orElse(null);
    }

    public void deleteByID(int id){
        repo.deleteById(id);
    }
    
    
}
