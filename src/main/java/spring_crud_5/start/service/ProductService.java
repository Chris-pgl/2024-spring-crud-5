package spring_crud_5.start.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_crud_5.start.entity.Product;
import spring_crud_5.start.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    ProductRepo repo;

    public Product save(Product p){
        return repo.save(p);
    }

    public List<Product> getAllProduct(){
        return repo.findAll();
    }

    public Optional<Product> getProductByID(int id){
         return repo.findById(id);
       
    }

    public void deleteProductById(int id){
        repo.deleteById(id);
    }

}
