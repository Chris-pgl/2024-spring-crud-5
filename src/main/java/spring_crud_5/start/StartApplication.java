package spring_crud_5.start;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring_crud_5.start.entity.Customer;
import spring_crud_5.start.entity.Order;
import spring_crud_5.start.entity.Product;
import spring_crud_5.start.service.CustomerService;
import spring_crud_5.start.service.OrderService;
import spring_crud_5.start.service.ProductService;

@SpringBootApplication
public class StartApplication implements CommandLineRunner{


	@Autowired
	CustomerService cService;

	@Autowired
	ProductService pService;

	@Autowired
	OrderService oService;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		//customerTest();
		//ordierTest();
		//productTest();
		// funzionanano tutti e 3 (Order non si può provare senza relazioni)
		//dopo aver aggiunto le relazioni-
		customOrderProductTest();

		}
		


		public void customerTest(){
			System.out.println("------------------------------------------------------------------------");

			System.out.println("Customers: ");
			Customer c1 = new Customer("Aldo", "Nosacc", "aldo@ahabdh2", "1123445568");
			Customer c2 = new Customer("Giacomo", "Nosacc", "giaco@jabbwu", "1123445568");
			Customer c3 = new Customer("Giovann", "Nosacc", "giocann@ahdh2", "1123445568");

			cService.save(c1);
			cService.save(c2);
			cService.save(c3);

			List<Customer> customers = cService.getAllCustomers();
			customers.forEach(System.out::println);


			System.out.println("------------------------------------------------------------------------");
		}

		public void ordierTest(){
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Orders: ");

			System.out.println("------------------------------------------------------------------------");
		}

		public void productTest(){
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Products: ");
			Product p1 = new Product("Pasta", 2, 10);
			Product p2 = new Product("Rice", 1, 5);
			Product p3 = new Product("Meat", 3, 15);

			pService.save(p1);
			pService.save(p2);
			pService.save(p3);

			List<Product> products = pService.getAllProduct();
			products.forEach(System.out::println);


			System.out.println("------------------------------------------------------------------------");
		}

		public void customOrderProductTest(){
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Product: ");
			Product p1 = new Product("Pasta", 2, 2);
			Product p2 = new Product("Rice", 1, 5);
			Product p3 = new Product("Meat", 3, 15);

			pService.save(p1);
			pService.save(p2);
			pService.save(p3);

			List<Product> products = pService.getAllProduct();
			products.forEach(System.out::println);

			System.out.println("------------------------------------------------------------------------");
			System.out.println("Costumer: ");

			Customer c1 = new Customer("Gino", "Ginetto", "gino@hahha", "123446678");
			Customer c2 = new Customer("Aldo", "aldino", "aldo@hahha","292930484");
			Customer c3 = new Customer("Giovann", "Giovannin", "gio@hayebkad","3459929201");
			
			cService.save(c1);
			cService.save(c2);
			cService.save(c3);
			
			List<Customer> customers = cService.getAllCustomers();
			customers.forEach(System.out::println);

			System.out.println("------------------------------------------------------------------------");
			System.out.println("Order: ");


			Order o1 = new Order();
			o1.setCustomer(c1);
			o1.addProduct(p1);

			Order o2 = new Order();
			o2.setCustomer(c2);
			o2.addProduct(p2);
			o2.addProduct(p3);
			

			oService.save(o1);
			oService.save(o2);

			try {
				System.out.println(o1);
				System.out.println(o2);
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			




		}
	}

/**
	 * REPO: 2024-spring-crud-5
	 * 
	 * TODO:
	 * 
	 * In nuovo esercizio sviluppare un'applicazione per gestire le seguenti
	 * entita':
	 * 
	 * Customer (cliente):
	 * - id : INT
	 * - name : STRING
	 * - lastname : STRING
	 * - email : STRING
	 * - phone : STRING
	 * 
	 * Order (ordine):
	 * - id : INT
	 * 
	 * Product (prodotto):
	 * - id : INT
	 * - name : STRING
	 * - price : INT
	 * - vat (iva percentuale) : INT
	 * 
	 * Un cliente puo' effettuare piu' ordini, ogni ordine contiene piu' prodotti.
	 * 
	 * La classe Order deve inoltre esporre il seguente metodo:
	 * - getFullPrice(boolean vat) : INT --> restituisce il prezzo totale
	 * dell'ordine
	 * comprensivo o meno dell'iva in base al
	 * parametro booleano in ingresso
	 * 
	 * La classe Product deve inoltre esporre il seguente metodo:
	 * - getFullPrice(boolean vat) : INT --> restituisce il prezzo totale del
	 * prodotto
	 * maggiorato dell'iva se la variabile booleana
	 * in ingresso e' true
	 * 
	 * Definire sensatamente le relazioni e testare adeguatamente sia classi che
	 * relazioni man mano che vengono implementate.
	 * 
	 * E' possibile definire altre classi/interfacce qualora lo si ritenga
	 * oppurtuno.
	 * 
	 */