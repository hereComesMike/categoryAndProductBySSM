package com.how2java.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper productMapper;
	
	public void add(Product product){
		productMapper.add(product);
	}
	
	public void delete(Product product){
		productMapper.delete(product.getId());
	}
	
	public void update(Product product){
		productMapper.update(product);
	}
	
	public Product get(int id){
		return productMapper.get(id);
	}
	
	public List<Product> list(Map m){
		return productMapper.list(m);
	}
	
	public int total(Category c){
		return productMapper.total(c);
	}
	

}
