package spring_crud_5.start.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    String name;
    String lastName;
    String email;
    String phone;
    
    
    public Customer() {
    
    }


    public Customer(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
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


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "\nCustomer \n[id=" + id + ", \nname=" + name + ", \nlastName=" + lastName + ", \nemail=" + email + ", \nphone="
                + phone + "\n]";
    }

    

    
}

/* 
* Customer (cliente):
* - id : INT
* - name : STRING
* - lastname : STRING
* - email : STRING
* - phone : STRING
*/ 
