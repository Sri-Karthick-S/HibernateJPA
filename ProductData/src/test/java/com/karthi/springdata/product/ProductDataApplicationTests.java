package com.karthi.springdata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.karthi.springdata.product.entities.Product;
import com.karthi.springdata.product.repos.ProductRepository;

@SpringBootTest
class ProductDataApplicationTests {
	
	@Autowired // Injecting repository dynamically using autowiring
	ProductRepository repository;

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Pen");
		product.setDesc("Black");
		product.setPrice(5.5);
		repository.save(product);
	}
	
	@Test
	public void testRead() {
		Product product = repository.findById(1).get();
		assertNotNull(product);
		assertEquals("Pen", product.getName());
	}
}
