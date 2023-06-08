package com.RestAPI.restAPIProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestAPI.restAPIProject.Entity.Product;
import com.RestAPI.restAPIProject.Entity.ProductInfo;
import com.RestAPI.restAPIProject.dao.ProductDAO;

@Service
public class ProductService {

       @Autowired
       ProductDAO dao;
       
    public Product addProduct(Product product,int cid)
   	{
    		return dao.addProduct(product, cid);
   	}
	public List<Product> allProducts()
	{
		return dao.allProducts();
	}
	
	public Product viewproduct(int pid)
	{
		return dao.viewproduct(pid);
	}

	public List<ProductInfo> allProductsWithCategory(int pid)
	{
		return dao.allProductsWithCategory(pid);
	}
	
	public Product deleteProduct(int pid)
	{
		return dao.deleteProduct(pid);
	}
	
}
