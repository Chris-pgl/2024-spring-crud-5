package spring_crud_5.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_crud_5.start.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    OrderRepo repo;
    
    
}
