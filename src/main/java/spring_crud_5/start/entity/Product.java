package spring_crud_5.start.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    private String name;
    private int price;
    private int vat;

    public Product() {
    }

    
    public Product(String name, int price, int vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    
    public int getFullPrice(boolean vatIncluded) {
        if (vatIncluded) {
            return (int) (price * (1 + (vat / 100.0)));
        } else {
            return price;
        }
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public int getVat() {
        return vat;
    }


    public void setVat(int vat) {
        this.vat = vat;
    }


    @Override
    public String toString() {
        return "\nProduct \n[id=" + id + ", \nname=" + name + ", \nprice=" + price + ", \nvat=" + vat + "\n]";
    }

    
    
}
