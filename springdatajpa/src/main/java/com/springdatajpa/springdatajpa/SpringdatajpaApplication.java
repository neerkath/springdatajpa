package com.springdatajpa.springdatajpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

		@Autowired
		private Productrepository productrepository;

	

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
        product.setName("product 1");
        product.setDescription("product 1 desc");
        product.setPrice(new Integer(100));
        

      
        productrepository.save(product);

        Product product2 = new Product();
        product2.setName("product 2");
        product2.setDescription("product 2 desc");
        product2.setPrice(new Integer(200));
       
    
        productrepository.save(product2);

       
        List<Product> lProducts = productrepository.findByPriceLessThan(150);
        lProducts.forEach((p) ->
                System.out.println(p));
                List<Product> lProducts1 = productrepository.findById(2);
                lProducts1.forEach((o) ->
                        System.out.println(o));
	}

}

	
