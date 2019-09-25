package com.cg.springcoredemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springcoredemo.dao.ProductDao;
import com.cg.springcoredemo.dto.Product;


@Service("productservice")
public class ProductServiceImpl implements ProductService{
	 @Autowired
    ProductDao productdao;
	public Product addProduct(Product pro) {
		
		// TODO Auto-generated method stub
		return productdao.addProduct(pro);
	}

	public List<Product> showProduct() {
		
		// TODO Auto-generated method stub
		return productdao.showProduct();

		}

}
