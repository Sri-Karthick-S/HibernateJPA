package com.karthi.springdata.product.repos;

import org.springframework.data.repository.CrudRepository;

import com.karthi.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	// CrudRepository<T, ID>
	// T -> Entity name for which we are creating the repository
	// ID -> Data type of @Id inside the entity

}
