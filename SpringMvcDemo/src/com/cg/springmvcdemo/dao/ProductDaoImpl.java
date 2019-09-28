package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("proddao")
public class ProductDaoImpl implements ProductDao {
	@PersistenceContext             //Makes a link with entitymanagerfactory
	EntityManager manager;

	@Override
	public Product save(Product prod) {
		// TODO Auto-generated method stub
		
		manager.persist(prod);
		return prod;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Query query=manager.createQuery("FROM Product");
				List<Product> myList=query.getResultList();
		return null;
	}

	@Override
	public Product findByProductId(int prodId) {
		// TODO Auto-generated method stub
		return manager.find(Product.class, prodId);
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		Product pro1=manager.find(Product.class, prodId);
		if(pro1!=null) {
			manager.remove(pro1);
			
	
		
	}

	/*List<Product> prodList = new ArrayList<Product>();  Using collections

	@Override
	public Product save(Product prod) {
		prodList.add(prod);
		return prod;
	}

	@Override
	public List<Product> findAll() {
		return prodList;
	}

	@Override
	public Product findByProductId(int prodId) {
		for (Product prod : prodList) {
			if (prodId == prod.getProdId()) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		
		for(Product product: prodList) {
			if(product.getProdId()==prodId) {
				prodList.remove(product);
				break;
			}
		}
		
	}*/

}
