package com.app.lokesh.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Product;
import com.app.lokesh.repository.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(productRepository.getClass().getName()); // [to get dynamic proxy class name]

		Product p1 = new Product(1, "mobile", 90000.0);
		Product p2 = new Product(2, "headphone", 3000.0);
		Product p3 = new Product(3, "charger", 2000.0);
		/*
		 * if recored in present then it's behave like (UPDATE) otherwise (INSERT) it
		 * behave like two in one [either INSERT or UPDATE ]
		 */
//		productRepository.save(p1); 
//		productRepository.save(p2);

		productRepository.saveAll(Arrays.asList(p1, p2, p3));

		/*
		 * Iterable<Product> prod = productRepository.findAll(); for (Product product :
		 * prod) { System.out.println(product); }
		 */

		/*
		 * Optional<Product> prodOptional = productRepository.findById(2); if
		 * (prodOptional.isPresent()) { Product p = prodOptional.get();
		 * System.out.println(p); } else { System.out.println("DATA NOT FOUND"); }
		 * System.out.println(prodOptional);
		 */

		/*
		 * boolean data = productRepository.existsById(2); System.out.println(data);
		 */

		/*
		 * Iterable<Product> prodIterable =productRepository.findAll();
		 * System.out.println(prodIterable);
		 */

		/*
		 * List<Integer> ids = Arrays.asList(1,2,3);
		 * 
		 * Iterable<Product> proIterable = productRepository.findAllById(ids);
		 * System.out.println(proIterable);
		 */

		/*
		 * long data = productRepository.count(); System.out.println(data);
		 */

		/* productRepository.deleteById(1); */

		/* productRepository.delete(p3); */

		/* productRepository.deleteAll(); */

		
		/*
		 * productRepository.deleteAllById( Arrays.asList(1,2,3)); System.out.println();
		 */
		 

	}
}
