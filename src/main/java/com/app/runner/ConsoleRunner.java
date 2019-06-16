package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

		//repo.findByProdCode("B").forEach(System.out::println);
		//repo.findByProdCodeIs("B").forEach(System.out::println);
		//repo.findByProdCodeEquals("B").forEach(System.out::println);

		//repo.findByProdCostLessThan(6.6).forEach(System.out::println);
		//repo.findByProdCostLessThanEqual(6.6).forEach(System.out::println);

		//repo.findByProdCodeOrProdCostLessThan("B", 5.5).forEach(System.out::println);

		//repo.findByProdCodeIsNull().forEach(System.out::println);

		//repo.findByProdCodeLike("B").forEach(System.out::println);

		//repo.findByProdCostBetween(1.1,6.6).forEach(System.out::println);

		//repo.findByProdCostIn(3.3).forEach(System.out::println);

		repo.findByProdCostOrderByProdCode(4.4).forEach(System.out::println);

	}

}
