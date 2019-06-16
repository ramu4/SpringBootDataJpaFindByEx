package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//List<Product> findByProdCode(String prodCode);
	//List<Product> findByProdCodeIs(String prodCode);
	//List<Product> findByProdCodeEquals(String prodCode);
	
	//List<Product> findByProdCostLessThan(Double prodCost);
	//List<Product> findByProdCostLessThanEqual(Double prodCost);
	
	//List<Product> findByProdCodeOrProdCostLessThan(String prodCode,Double prodCost);
	
	//List<Product> findByProdCodeIsNull();
	
	//List<Product> findByProdCodeLike(String prodCode);
	
	//List<Product> findByProdCostBetween(Double prodCost1,Double prodCost2);
	
	//List<Product> findByProdCostIn(List<Double> prodCosts);
	
	List<Product> findByProdCostOrderByProdCode(Double cost);
	
}
