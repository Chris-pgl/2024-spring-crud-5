package spring_crud_5.start.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    
    //aggiungere successivamente il resto.

    
    
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