package com.RestAPI.restAPIProject.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Mobile {
	

	// create table mobile(mobileid int,price int,speed int)
	// variables of entity class and column names of tables should be same .
	// insert into mobile values(10,8) 
	// insert into mobile values(23,10)
	// insert into mobile values(23,25)
	// insert into mobile values(25,65)

      @Id
		Integer mobileid; // use Integer NOT int
		public Integer price; // use Integer NOT int
		public Integer speed; // // use Integer NOT int
			
		// Integer is a class and price is reference using which we will call compareTo() method
		// using primitive int we can not call method
		
		public Integer getMobileid() {
			return mobileid;
		}

		public void setMobileid(Integer mobileid) {
			this.mobileid = mobileid;
		}

		public Integer getPrice() {
			return price;
		}
		
		public void setPrice(Integer price) {
			this.price = price;
		}
		
		public Integer getSpeed() {
			return speed;
		}
		
		public void setSpeed(Integer speed) {
			this.speed = speed;
		}

		@Override
		public String toString() {
			return "Mobile [mobileid=" + mobileid + ", price=" + price + ", speed=" + speed + "]";
		}
		
	}


