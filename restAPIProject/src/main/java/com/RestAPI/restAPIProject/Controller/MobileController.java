package com.RestAPI.restAPIProject.Controller;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.restAPIProject.SortOnPrice;
import com.RestAPI.restAPIProject.Entity.Mobile;

import java.util.*;

	/* Sort mobile objects based on ascending order of price and if prices are equal , then sort mobiles
	 * based on descending order of speed of mobile.
	 *  */

	@RestController
	public class MobileController 
	{
		@Autowired
		SessionFactory factory;
		
		@RequestMapping("getData")
		public List<Mobile> getData()
		{
			List<Mobile> arrayList =factory.openSession().createCriteria(Mobile.class).list();
			
			//List<Mobile> arrayList =factory.openSession().createQuery("from Mobile").list();
			
			System.out.println(arrayList);

			// TreeSet(Comparator c)
			
			// Constructor of TreeSet class needs Comparator object , hence we have passed object of
			// implementation class of Comparator interface .
			
			// TreeSet will sort mobile objects based on given definition of compare method
			
			TreeSet<Mobile> treeset=new TreeSet(new SortOnPrice());
			
			treeset.addAll(arrayList); // add all mobiles from arraylist into treeset

			ArrayList<Mobile> mobiles=new ArrayList(treeset); // converts treeset into ArrayList
			
			return mobiles ;

		}
		
		
	}


	/*
	     //		for (Mobile mobile : arrayList) 
//			{
//				int price=mobile.price;
//				
//				if(price>=15 && price<=30)
//					treeset.add(mobile);
//			}
//			
			//System.out.println(treeset);

	*/
	
	
	

