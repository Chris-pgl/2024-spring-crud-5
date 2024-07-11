package spring_crud_5.start.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "orders")// cambio la parola nella tabella perché 'order' è una parola riservata sul db
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name= "customer_id")
    Customer customer;

    @ManyToMany
    List<Product> products;
    //aggiungere successivamente il resto.

    public Order(){
       this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getFullPrice(boolean vat) {
        return products.stream()
                .mapToInt(product -> product.getFullPrice(vat))
                .sum();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", customer=" + customer + ", products=" + products + "]";
    }

    
    
}
/* 
Order (ordine):
	 * - id : INT
	 * 
	 * Product (prodotto):
	 * - id : INT
	 * - name : STRING
	 * - price : INT
	 * - vat (iva percentuale) : INT
	 */ 