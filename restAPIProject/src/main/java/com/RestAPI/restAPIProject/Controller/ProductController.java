package com.RestAPI.restAPIProject.Controller;




import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.RestAPI.restAPIProject.Entity.Product;
import com.RestAPI.restAPIProject.Entity.ProductInfo;
import com.RestAPI.restAPIProject.service.ProductService;


@RequestMapping("productapi")
@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("allProducts")
	public List<Product> allProducts()
	{
		
		return service.allProducts();
	}
	
	@RequestMapping("viewproduct/{pid}")
    public Product viewproduct(@PathVariable int pid)
	{
		return service.viewproduct(pid);
	}
	
	@RequestMapping("allProductsWithCategory/{pid}")
	public List<ProductInfo> allProductsWithCategory(@PathVariable int pid)
	{
		return service.allProductsWithCategory(pid);
	}
	
	@RequestMapping("deleteProduct/{pid}")
	public Product deleteProduct(@PathVariable int pid)
	{
		return service.deleteProduct(pid);
	}
	
	
}




































































//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.query.NativeQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.RestAPI.restAPIProject.Entity.Category;
//import com.RestAPI.restAPIProject.Entity.Product;
//
//@RestController
//@RequestMapping("productapi")
//
//public class ProductController 
//{
//	@Autowired
//	SessionFactory factory;
//	
//	@PostMapping("product/{cid}")
//	public Product addProduct(@RequestBody Product product,@PathVariable int cid)
//	{
//		System.out.println("Category id is " + cid);
//		
//		Session session=factory.openSession();
//		
//		Category category=session.load(Category.class,cid);
//		
//		 System.out.println("Products from given catergory are :- " + category.getProducts());
//		
//		/* get list of product and add product into it  */
//		
//		List<Product> productlist=category.getProducts();
//					
//		Transaction transaction=session.beginTransaction();
//		
//			productlist.add(product);
//						
//		transaction.commit();
//				
//		System.out.println("product added into database");
//		
//		return product;
//		
//	
//	}
//
//	
//	
//	// {"pid":1 , "name":pen,"price":20}
//	// clientProduct ==> [pid=1 , name=pen , price=20] 
//	@PutMapping("productt")
//	public Product updateProduct(@RequestBody Product clientProduct)
//	{
//				Session session=factory.openSession();
//				
//				Transaction transaction=session.beginTransaction();
//				
//					session.update(clientProduct);
//								
//				transaction.commit();
//								
//				return clientProduct;
//
//	}
//	
//	@DeleteMapping("delete/{pid}")
//	public String deleterecord(@PathVariable int pid) {
//		Session session=factory.openSession();
//		Transaction tr = session.beginTransaction();
//		Product li=session.get(Product.class, pid);
//		session.delete(li);
//		tr.commit();
//		session.close();
//		return "record deleted";
//		
//	}
//	@GetMapping("getrecords")
//	public List<Product> getrecord() {
//		
//		Session session=factory.openSession();
//		//Transaction tr = session.beginTransaction();
//		Criteria criteria=session.createCriteria(Product.class);
//		List<Product> li=criteria.list();
//		
//		System.out.println(li);
//		//session.close();
//		//tr.commit();
//		return li;
//		
//		
//		
//	}
//	
//	
