package com.RestAPI.restAPIProject;

import java.util.Comparator;

import com.RestAPI.restAPIProject.Entity.Mobile;

/* Sort mobile objects based on ascending order of price and if prices are equal , then sort mobiles
 * based on descending order of speed of mobile.
 *  */
public class SortOnPrice implements Comparator<Mobile>
{
	
	public int compare(Mobile mobile1, Mobile mobile2) 
	{
		Integer price1=mobile1.price;
		Integer price2=mobile2.price;
		
		// If prices are equals , then sort based on descending order of speed
		
		if(price1.equals(price2))
			return - mobile1.speed.compareTo(mobile2.speed);// speed
		else
			return price1.compareTo(price2); // price based sorting
	}

	
	
}
